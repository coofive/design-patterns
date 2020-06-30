package com.coofive.factory.abstractfactory;

import com.coofive.factory.parser.IRuleConfigParser;
import com.coofive.factory.parser.ISystemConfigParser;
import com.coofive.factory.parser.rule.JsonRuleConfigParser;
import com.coofive.factory.parser.system.JsonSystemConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-30 05:49
 */
public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemConfigParser() {
        return new JsonSystemConfigParser();
    }
}
