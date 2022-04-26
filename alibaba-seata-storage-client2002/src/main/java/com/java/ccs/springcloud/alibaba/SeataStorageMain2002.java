package com.java.ccs.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:12 2022/4/27
 * exclude = DataSourceAutoConfiguration.class 取消数据源的自动创建,
 * 读取自定义的DataSourceProxyConfig.class类，使用Seata对数据源进行代理
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataStorageMain2002 {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageMain2002.class, args);
        System.out.println("启动成功");
    }

}