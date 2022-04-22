package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:10 2022/4/20
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClientMain3355 {

    /**
     * (1)使用bootstrap.yml
     * 说明: application.yml是用户级的资源配置项，bootstrap.yml是系统级,优先级更高。
     * SpringCloud会创建一个"Bootstrap Context",作为Spring应用的"Application Context"的父上下文。
     * 初始化的时候,"Bootstrap Context"负责从外部源加载配置属性并解析配置。这两个上下文共享一个从外部获取的"Environment"。
     * <p>
     * (2)测试地址: http://localhost:3355/configInfo
     * 得到bootstrap.yml文件中配置的(master/config-dev.yml)中的内容。
     * 模拟实现了从客户端3355访问3344中配置在gitee中的内容。
     * <p>
     * (3)分布式配置动态刷新问题
     * 说明：当gitee中内容变更,3344立即响应,但是3355没有响应变更。(重启3355才可以获取最新变更)
     * 解决：
     * 手动刷新：加入actuator监控pom -> 暴露监控端点 -> @RefreshScope -> 执行curl -X POST "http://localhost:3355/actuator/refresh" (或者用postman发送Post请求)
     * 避免服务重启,但仍然需要每个客户端都执行一次curl指令。
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientMain3355.class, args);
        System.out.println("启动成功");
    }
}
