package com.coofive.factory.simplefactory.demo1;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:58
 */
public class YmlRuleConfigParser implements IRuleConfigParser {

    @Override
    public RuleConfig parse(String ruleConfigFilePath) {
        return new RuleConfig();
    }
}
