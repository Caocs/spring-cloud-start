package com.java.ccs.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Cao.cs
 * @Date: Created in 12:36 2022/3/19
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * @LoadBalanced：赋予RestTemplate负载均衡的能力（默认是轮训）
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
