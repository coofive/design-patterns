package com.coofive.factory;

import com.coofive.factory.config.RuleConfig;
import com.coofive.factory.simplefactory.RuleConfigSimpleFactory1;
import com.coofive.factory.simplefactory.RuleConfigSimpleFactory2;

/**
 * 简单工厂demo2
 *
 * 根据demo1优化获取parser类，如果 parser 可以复用，为了节省内存和对象创建的时间
 *
 * 需求：根据配置文件的后缀（json/xml/yml/properties）,选择不同的解析器(JsonRuleConfigParser...)，将存储在文件中的配置解析成对象RuleConfig。
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:39
 */
public class RuleConfigSimpleFactoryMain {
    public static void main(String[] args) {
        RuleConfigSimpleFactory1 ruleConfigSimpleFactory1 = new RuleConfigSimpleFactory1();
        RuleConfig ruleConfig1 = ruleConfigSimpleFactory1.load("test.json");

        RuleConfigSimpleFactory2 ruleConfigSimpleFactory2 = new RuleConfigSimpleFactory2();
        RuleConfig ruleConfig2 = ruleConfigSimpleFactory2.load("test.json");
    }
}
