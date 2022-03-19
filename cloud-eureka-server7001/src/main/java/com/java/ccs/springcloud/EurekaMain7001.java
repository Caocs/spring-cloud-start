package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Cao.cs
 * @Date: Created in 15:57 2022/3/19
 * 注意：
 * @EnableEurekaServer：表示启动Eureka服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

    /**
     * 单机版Eureka服务注册中心服务
     * http://localhost:7001/
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }

}
