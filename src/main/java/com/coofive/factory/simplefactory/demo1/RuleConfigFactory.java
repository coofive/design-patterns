package com.coofive.factory.simplefactory.demo1;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:36
 */
public class RuleConfigFactory {

    /**
     * 配置文件中加载配置
     *
     * @param ruleConfigFilePath 配置文件路径
     * @return 生成的配置类
     */
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFilePathExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser ruleConfigParser = null;
        if ("json".equalsIgnoreCase(ruleConfigFilePathExtension)) {
            ruleConfigParser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFilePathExtension)) {
            ruleConfigParser = new XmlRuleConfigParser();
        } else if ("yml".equalsIgnoreCase(ruleConfigFilePathExtension)) {
            ruleConfigParser = new YmlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFilePathExtension)) {
            ruleConfigParser = new YmlRuleConfigParser();
        } else {
            throw new IllegalArgumentException(String.format("Rule config file format is not supported:%s", ruleConfigFilePath));
        }
        return ruleConfigParser.parse(ruleConfigFilePath);
    }

    /**
     * 获取文件扩展名
     *
     * @param ruleConfigFilePath 配置文件路径
     * @return 扩展名
     */
    private String getFileExtension(String ruleConfigFilePath) {
        if (ruleConfigFilePath == null || ruleConfigFilePath.isEmpty()) {
            return "";
        }
        int beginIndex = ruleConfigFilePath.lastIndexOf(".");
        if (beginIndex < 0) {
            return "";
        }
        return ruleConfigFilePath.substring(beginIndex + 1);
    }
}
