package com.coofive.factory.factorymethod;

import com.coofive.factory.parser.IRuleConfigParser;
import com.coofive.factory.parser.rule.YmlRuleConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-29 21:55
 */
public class YmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        System.out.println("获取YML格式解析器");
        return new YmlRuleConfigParser();
    }
}
