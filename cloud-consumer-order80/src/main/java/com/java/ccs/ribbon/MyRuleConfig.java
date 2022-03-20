package com.java.ccs.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Cao.cs
 * @Date: Created in 14:47 2022/3/20
 * 指定Ribbon负载均衡算法配置。
 * 注意：
 * 这个自定义配置类不能放在@ComponentScan所扫描的当前包及子包下，
 * 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的了。
 */
@Configuration
public class MyRuleConfig {

    /**
     * @return 向Spring注入指定的Ribbon负载均衡算法。
     * 在项目启动处@SpringBootApplication，添加注解@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyRuleConfig.class)
     * 表示在启动该服务时去加载自定义的ribbon配置
     */
    @Bean
    public IRule myRibbonRule() {
        return new RandomRule();
    }

}
