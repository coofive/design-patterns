package com.coofive.factory.abstractfactory;

import com.coofive.factory.parser.IRuleConfigParser;
import com.coofive.factory.parser.ISystemConfigParser;
import com.coofive.factory.parser.rule.PropertiesRuleConfigParser;
import com.coofive.factory.parser.system.PropertiesSystemConfigParser;

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
