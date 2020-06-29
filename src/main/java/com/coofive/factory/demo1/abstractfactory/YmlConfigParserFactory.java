package com.coofive.factory.demo1.abstractfactory;

import com.coofive.factory.demo1.parser.IRuleConfigParser;
import com.coofive.factory.demo1.parser.ISystemConfigParser;
import com.coofive.factory.demo1.parser.rule.YmlRuleConfigParser;
import com.coofive.factory.demo1.parser.system.YmlSystemConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-30 05:52
 */
public class YmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new YmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemConfigParser() {
        return new YmlSystemConfigParser();
    }
}
