package com.java.ccs.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:56 2022/4/23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumerMain83 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerMain83.class, args);
        System.out.println("启动成功");
    }

}