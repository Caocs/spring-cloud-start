package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Cao.cs
 * @Date: Created in 16:51 2022/3/19
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    /**
     * 单机演示集群版Eureka服务注册中心服务
     * http://eureka7002.com:7002/
     * 注意：
     * 在C:/Windows/System32/drivers/etc/hosts中配置映射：
     * 127.0.0.1       eureka7001.com
     * 127.0.0.1       eureka7002.com
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }

}
