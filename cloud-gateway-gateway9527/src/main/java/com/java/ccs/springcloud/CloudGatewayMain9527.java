package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:02 2022/4/18
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayMain9527 {

    /**
     * 1、网关如何做路由映射？
     * 解：以cloud-provider-payment8001为例，我们不想直接暴露该服务的8001端口，希望在8001外层套一层9527端口。
     * 然后在yml配置中，进行网关路由、断言配置。
     * (http://localhost:9527/payment/search/1)
     * 2、Gateway网关路由有两种配置方式
     * 解：(1)在配置文件yml中配置
     * ---(2)代码中注入RouteLocator的Bean
     * 3、Gateway实现动态路由
     * 解：默认情况下，Gateway会根据注册中心注册的服务列表，以注册中心上微服务名为路径创建动态路由进行转发，从而实现动态路由的功能。
     * 注意：此时uri的协议为lb，表示启用Gateway的负载均衡功能。
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayMain9527.class, args);
        System.out.println("启动成功");
    }

}
