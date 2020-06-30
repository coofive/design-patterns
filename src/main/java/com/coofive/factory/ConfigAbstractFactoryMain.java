package com.coofive.factory;

import com.coofive.factory.config.RuleConfig;
import com.coofive.factory.abstractfactory.ConfigAbstractFactory;
import com.coofive.factory.config.SystemConfig;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-30 05:57
 */
public class ConfigAbstractFactoryMain {
    public static void main(String[] args) {
        ConfigAbstractFactory configAbstractFactory = new ConfigAbstractFactory();
        RuleConfig ruleConfig = configAbstractFactory.loadRuleConfig("test.json");
        SystemConfig systemConfig = configAbstractFactory.loadSystemConfig("test.yml");
    }
}
