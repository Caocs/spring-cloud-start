package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 10:59 2022/4/23
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitMQConsumer8802 {

    /**
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMQConsumer8802.class, args);
        System.out.println("启动成功");
    }

}
