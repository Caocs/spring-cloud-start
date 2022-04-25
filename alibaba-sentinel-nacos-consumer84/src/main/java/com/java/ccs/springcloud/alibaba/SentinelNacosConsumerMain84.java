package com.java.ccs.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Cao.cs
 * @Date: Created in 1:03 2022/4/26
 */
@SpringBootApplication
@EnableDiscoveryClient // 服务注册到Nacos(自带ribbon负载均衡和RestTemplate)
@EnableFeignClients // 启用OpenFeign(可以负载均衡的提供简洁的Rest调用)
public class SentinelNacosConsumerMain84 {

    /**
     * (1)使用Ribbon远程调用
     * (2)使用OpenFeign远程调用
     */
    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosConsumerMain84.class, args);
        System.out.println("启动成功");
    }
}
