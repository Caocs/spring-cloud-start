package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:24 2022/3/18
 * 注意：
 * @EnableEurekaClient：表示Eureka客户端
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8002 {

    /**
     * 从cloud-provider-payment8001模块复制，
     * 注意：
     * （1）修改端口号
     * （2）项目名称不变，对外相当于同一个服务。spring.application.name: cloud-payment-service
     */
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
        System.out.println("启动成功");
    }
}
