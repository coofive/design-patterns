package com.coofive.factory.abstractfactory;

import com.coofive.factory.parser.IRuleConfigParser;
import com.coofive.factory.parser.ISystemConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-30 05:43
 */
public interface IConfigParserFactory {
    /**
     * 规则解析器
     *
     * @return
     */
    IRuleConfigParser createRuleConfigParser();

    /**
     * 系统解析器
     *
     * @return
     */
    ISystemConfigParser createSystemConfigParser();
}
