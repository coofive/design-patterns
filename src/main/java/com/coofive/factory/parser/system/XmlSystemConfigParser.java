package com.coofive.factory.parser.system;

import com.coofive.factory.config.SystemConfig;
import com.coofive.factory.parser.ISystemConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:58
 */
public class XmlSystemConfigParser implements ISystemConfigParser {

    @Override
    public SystemConfig parse(String ruleConfigFilePath) {
        System.out.println("解析XML格式的系统配置文件");
        return new SystemConfig();
    }
}
