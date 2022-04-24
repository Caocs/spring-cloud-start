package com.java.ccs.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:46 2022/4/23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigMain3377 {

    /**
     * (1)Nacos做配置中心
     * 首先在Nacos配置管理中添加对应的yaml配置文件(文件名必须根据固定规则命名)
     * 测试地址：localhost:3377/config/info
     * (2)分类配置(多环境多项目管理)
     * Namespace+Group+DataID
     * NameSpace: 主要用来实现隔离，比如开发，测试，生产环境
     * Group: 默认是DEFAULT_GROUP，可以把不同的微服务划分到同一个分组里面去。
     * DataID: 逻辑上区分两个目标对象。
     * (3)Nacos持久化配置
     * 使用mysql做持久化
     */
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain3377.class, args);
        System.out.println("启动成功");
    }
}
