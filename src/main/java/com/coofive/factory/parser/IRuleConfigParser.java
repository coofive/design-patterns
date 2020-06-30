package com.coofive.factory.parser;

import com.coofive.factory.config.RuleConfig;

/**
 * 配置规则解析器
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-24 06:56
 */
public interface IRuleConfigParser {
    /**
     * 解析配置文件
     *
     * @param ruleConfigFilePath 配置文件路径
     * @return 生成配置类
     */
    RuleConfig parse(String ruleConfigFilePath);
}
