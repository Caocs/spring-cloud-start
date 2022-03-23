package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:20 2022/3/23
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001 {

    /**
     * 访问 localhost:9001/hystrix
     * 输入 http://localhost:8001/hystrix.stream ,监控该服务的状况。
     */
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class, args);
        System.out.println("启动成功");
    }

}
