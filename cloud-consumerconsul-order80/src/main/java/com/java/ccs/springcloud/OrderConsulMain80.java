package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 13:45 2022/3/20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {

    /**
     * 以Consul作为服务注册发现中心.
     */
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
        System.out.println("启动成功");
    }

}
