package com.coofive.factory.demo1.simplefactory;

import com.coofive.factory.demo1.parser.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-29 06:38
 */
public class RuleConfigParserFactory {
    private final static Map<String, IRuleConfigParser> cacheParsers = new HashMap<>();

    static {
        cacheParsers.put("json", new JsonRuleConfigParser());
        cacheParsers.put("xml", new XmlRuleConfigParser());
        cacheParsers.put("yml", new YmlRuleConfigParser());
        cacheParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String fileExtensionPath) {
        if (fileExtensionPath == null || fileExtensionPath.isEmpty()) {
            return null;
        }
        return cacheParsers.get(fileExtensionPath.toLowerCase());
    }
}
