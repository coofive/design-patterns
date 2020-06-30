package com.coofive.factory.abstractfactory;

import com.coofive.factory.parser.IRuleConfigParser;
import com.coofive.factory.parser.ISystemConfigParser;
import com.coofive.factory.parser.rule.XmlRuleConfigParser;
import com.coofive.factory.parser.system.XmlSystemConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-30 05:51
 */
public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemConfigParser() {
        return new XmlSystemConfigParser();
    }
}
