package com.coofive.factory.demo1.abstractfactory;

import com.coofive.factory.demo1.parser.IRuleConfigParser;
import com.coofive.factory.demo1.parser.ISystemConfigParser;
import com.coofive.factory.demo1.parser.rule.XmlRuleConfigParser;
import com.coofive.factory.demo1.parser.system.XmlSystemConfigParser;

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
