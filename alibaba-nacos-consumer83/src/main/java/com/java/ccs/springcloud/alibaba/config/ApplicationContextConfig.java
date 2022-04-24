package com.java.ccs.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:58 2022/4/23
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * Ribbon中自带的RestTemplate及负载均衡
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
