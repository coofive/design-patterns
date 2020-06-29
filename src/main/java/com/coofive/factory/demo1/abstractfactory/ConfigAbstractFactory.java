package com.coofive.factory.demo1.abstractfactory;

import com.coofive.factory.demo1.config.RuleConfig;
import com.coofive.factory.demo1.config.SystemConfig;
import com.coofive.factory.demo1.parser.IRuleConfigParser;
import com.coofive.factory.demo1.parser.ISystemConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-29 22:16
 */
public class ConfigAbstractFactory {
    private final static Map<String, IConfigParserFactory> cacheParsers = new HashMap<>();

    static {
        cacheParsers.put("json", new JsonConfigParserFactory());
        cacheParsers.put("xml", new XmlConfigParserFactory());
        cacheParsers.put("yml", new YmlConfigParserFactory());
        cacheParsers.put("properties", new PropertiesConfigParserFactory());
    }

    public static IConfigParserFactory getFactory(String fileExtensionPath) {
        if (fileExtensionPath == null || fileExtensionPath.isEmpty()) {
            return null;
        }
        return cacheParsers.get(fileExtensionPath.toLowerCase());
    }



    /**
     * 配置文件中加载规则配置
     *
     * @param ruleConfigFilePath 配置文件路径
     * @return 生成的配置类
     */
    public RuleConfig loadRuleConfig(String ruleConfigFilePath) {
        String ruleConfigFilePathExtension = getFileExtension(ruleConfigFilePath);
        IConfigParserFactory factory = getFactory(ruleConfigFilePathExtension);
        if (factory == null)  {
            throw new IllegalArgumentException(String.format("Rule config file format is not supported:%s", ruleConfigFilePath));
        }
        IRuleConfigParser configParser = factory.createRuleConfigParser();
        if (configParser == null)  {
            throw new IllegalArgumentException(String.format("Rule config file format is not supported:%s", ruleConfigFilePath));
        }
        return configParser.parse(ruleConfigFilePath);
    }

    /**
     * 配置文件中加载系统配置
     *
     * @param ruleConfigFilePath 配置文件路径
     * @return 生成的配置类
     */
    public SystemConfig loadSystemConfig(String ruleConfigFilePath) {
        String ruleConfigFilePathExtension = getFileExtension(ruleConfigFilePath);
        IConfigParserFactory factory = getFactory(ruleConfigFilePathExtension);
        if (factory == null)  {
            throw new IllegalArgumentException(String.format("Rule config file format is not supported:%s", ruleConfigFilePath));
        }
        ISystemConfigParser configParser = factory.createSystemConfigParser();
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
