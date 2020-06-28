package com.coofive.factory.simplefactory.demo1;

/**
 * 需求：根据配置文件的后缀（json/xml/yml/properties）,选择不同的解析器(JsonRuleConfigParser...)，将存储在文件中的配置解析成对象RuleConfig。
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:39
 */
public class RuleConfigMain {
    public static void main(String[] args) {
        RuleConfigFactory ruleConfigFactory = new RuleConfigFactory();
        RuleConfig ruleConfig = ruleConfigFactory.load("test.json");
    }
}
