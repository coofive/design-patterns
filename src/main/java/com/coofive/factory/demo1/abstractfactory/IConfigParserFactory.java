package com.coofive.factory.demo1.abstractfactory;

import com.coofive.factory.demo1.parser.IRuleConfigParser;
import com.coofive.factory.demo1.parser.ISystemConfigParser;

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
