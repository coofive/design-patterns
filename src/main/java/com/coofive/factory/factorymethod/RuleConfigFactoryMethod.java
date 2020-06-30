package com.coofive.factory.factorymethod;

import com.coofive.factory.config.RuleConfig;
import com.coofive.factory.parser.IRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-29 22:16
 */
public class RuleConfigFactoryMethod {
    private final static Map<String, IRuleConfigParserFactory> cacheParsers = new HashMap<>();

    static {
        cacheParsers.put("json", new JsonRuleConfigParserFactory());
        cacheParsers.put("xml", new XmlRuleConfigParserFactory());
        cacheParsers.put("yml", new YmlRuleConfigParserFactory());
        cacheParsers.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getFactory(String fileExtensionPath) {
        if (fileExtensionPath == null || fileExtensionPath.isEmpty()) {
            return null;
        }
        return cacheParsers.get(fileExtensionPath.toLowerCase());
    }



    /**
     * 配置文件中加载配置
     *
     * @param ruleConfigFilePath 配置文件路径
     * @return 生成的配置类
     */
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFilePathExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory factory = getFactory(ruleConfigFilePathExtension);
        if (factory == null)  {
            throw new IllegalArgumentException(String.format("Rule config file format is not supported:%s", ruleConfigFilePath));
        }
        IRuleConfigParser configParser = factory.createParser();
        if (configParser == null)  {
            throw new IllegalArgumentException(String.format("Rule config file format is not supported:%s", ruleConfigFilePath));
        }
        return configParser.parse(ruleConfigFilePath);
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
