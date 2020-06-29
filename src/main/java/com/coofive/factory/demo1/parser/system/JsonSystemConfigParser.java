package com.coofive.factory.demo1.parser.system;

import com.coofive.factory.demo1.config.RuleConfig;
import com.coofive.factory.demo1.config.SystemConfig;
import com.coofive.factory.demo1.parser.ISystemConfigParser;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:58
 */
public class JsonSystemConfigParser implements ISystemConfigParser {

    @Override
    public SystemConfig parse(String ruleConfigFilePath) {
        System.out.println("解析JSON格式的系统配置文件");
        return new SystemConfig();
    }
}
