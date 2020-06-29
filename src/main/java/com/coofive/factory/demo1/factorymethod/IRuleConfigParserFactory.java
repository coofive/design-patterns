package com.coofive.factory.demo1.factorymethod;

import com.coofive.factory.demo1.parser.IRuleConfigParser;

/**
 * 策略模式获取不同的解析器
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-29 21:54
 */
public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
