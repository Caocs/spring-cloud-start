package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 13:40 2022/3/20
 * @EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

    /**
     * 以Consul作为服务注册发现中心.
     */
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
        System.out.println("启动成功");
    }

}
