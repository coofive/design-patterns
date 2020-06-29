package com.coofive.factory.demo1.abstractfactory;

import com.coofive.factory.demo1.parser.IRuleConfigParser;
import com.coofive.factory.demo1.parser.ISystemConfigParser;
import com.coofive.factory.demo1.parser.rule.JsonRuleConfigParser;
import com.coofive.factory.demo1.parser.system.JsonSystemConfigParser;

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
