package com.coofive.factory.demo1.factorymethod;

import com.coofive.factory.demo1.parser.IRuleConfigParser;
import com.coofive.factory.demo1.parser.XmlRuleConfigParser;
import com.coofive.factory.demo1.parser.YmlRuleConfigParser;

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
