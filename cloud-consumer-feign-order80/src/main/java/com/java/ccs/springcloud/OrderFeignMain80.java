package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Cao.cs
 * @Date: Created in 20:27 2022/3/20
 */
@SpringBootApplication
@EnableFeignClients // 启动feign
public class OrderFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
        System.out.println("启动成功");
    }

}
