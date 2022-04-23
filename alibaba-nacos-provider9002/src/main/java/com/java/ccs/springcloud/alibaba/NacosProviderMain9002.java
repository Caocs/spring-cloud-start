package com.java.ccs.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 18:24 2022/4/23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosProviderMain9002 {

    /**
     * (1)Nacos下载安装启动教程：
     * https://blog.csdn.net/weixin_40050628/article/details/117827020
     * (2)Nacos首页：
     * http://localhost:8848/nacos/index.html
     */
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderMain9002.class, args);
        System.out.println("启动成功");
    }
}
