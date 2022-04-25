package com.java.ccs.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:58 2022/4/26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelNacosProviderMain9004 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosProviderMain9004.class, args);
        System.out.println("启动成功");
    }

}
