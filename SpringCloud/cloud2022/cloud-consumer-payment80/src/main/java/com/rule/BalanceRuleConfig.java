package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/25 10:25
 */
@Configuration
public class BalanceRuleConfig {

    @Bean
    public IRule myRule(){
        //将轮训规则修改为随机
        return new RandomRule();
    }

}
