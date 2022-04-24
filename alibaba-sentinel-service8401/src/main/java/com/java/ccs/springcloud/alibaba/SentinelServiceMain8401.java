package com.java.ccs.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:47 2022/4/25
 */
@EnableDiscoveryClient // 将该服务注册到Nacos中
@SpringBootApplication
public class SentinelServiceMain8401 {

    /**
     * (1)Sentinel dashboard启动：
     * 下载地址：从GitHub中下载(https://github.com/alibaba/Sentinel/releases)
     * 控制台执行 java -jar .\sentinel-dashboard-1.7.1.jar
     * 浏览器打开：http://localhost:8080/#/dashboard
     * Sentinel采用懒加载，执行过一次访问后即可在dashboard中显示。
     * (2)流控管理
     * https://github.com/alibaba/Sentinel/wiki/%E6%B5%81%E9%87%8F%E6%8E%A7%E5%88%B6
     * <p>
     * (3)降级管理
     * https://github.com/alibaba/Sentinel/wiki/%E7%86%94%E6%96%AD%E9%99%8D%E7%BA%A7
     * (4)热点key限流
     * (5)系统规则
     * (6)SentinelResource
     * (7)服务熔断自定义
     * (8)规则持久化
     */
    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceMain8401.class, args);
        System.out.println("启动成功");
    }
}
