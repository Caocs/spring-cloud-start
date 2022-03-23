package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Cao.cs
 * @Date: Created in 20:43 2022/3/23
 */
@SpringBootApplication
@EnableFeignClients // 启动 feign
@EnableHystrix // 启动 hystrix
public class ConsumerFeignHystrixOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixOrder80.class, args);
        System.out.println("启动成功");
    }

}
