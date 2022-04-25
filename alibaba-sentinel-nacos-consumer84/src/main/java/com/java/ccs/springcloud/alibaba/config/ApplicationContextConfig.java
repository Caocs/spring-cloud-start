package com.java.ccs.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Cao.cs
 * @Date: Created in 1:19 2022/4/26
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * @return Nacos自带的Ribbon中, 负载均衡的使用RestTemplate进行远程调用其他服务。
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
