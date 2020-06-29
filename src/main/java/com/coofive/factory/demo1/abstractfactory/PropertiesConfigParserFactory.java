package com.coofive.factory.demo1.abstractfactory;

import com.coofive.factory.demo1.parser.IRuleConfigParser;
import com.coofive.factory.demo1.parser.ISystemConfigParser;
import com.coofive.factory.demo1.parser.rule.PropertiesRuleConfigParser;
import com.coofive.factory.demo1.parser.system.PropertiesSystemConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-30 05:50
 */
public class PropertiesConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new PropertiesRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemConfigParser() {
        return new PropertiesSystemConfigParser();
    }
}
