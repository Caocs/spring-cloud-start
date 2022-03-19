package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:20 2022/3/19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
    /**
     * 以Zookeeper作为服务注册发现中心.
     * 当服务启动后，Zookeeper中会多一个"services"节点。
     */
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class, args);
        System.out.println("启动成功");
    }

}
