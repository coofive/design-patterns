package com.coofive.factory.demo1.parser;

import com.coofive.factory.demo1.config.RuleConfig;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:58
 */
public class YmlRuleConfigParser implements IRuleConfigParser {

    @Override
    public RuleConfig parse(String ruleConfigFilePath) {
        System.out.println("解析YML格式的配置文件");
        return new RuleConfig();
    }
}
