package com.coofive.factory.abstractfactory;

import com.coofive.factory.parser.IRuleConfigParser;
import com.coofive.factory.parser.ISystemConfigParser;
import com.coofive.factory.parser.rule.YmlRuleConfigParser;
import com.coofive.factory.parser.system.YmlSystemConfigParser;

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
