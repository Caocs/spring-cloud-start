package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:18 2022/4/19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer // 配置中心服务端
public class CloudConfigCenterMain3344 {
    /**
     * (1)为了在windows下模拟，修改hosts文件，添加映射(127.0.0.1 config-3344.com)
     * 也可以不配置(访问http://localhost:3344/master/config-dev.yml)
     * 配置模板：/{label}/{application}-{profile}.yml
     * (2)本来想使用github的，奈何访问速度实在感人，最终放弃。改用Gitee。
     * https://gitee.com/cscao/spring-cloud-config-repository.git
     * <p>
     * (3)使用SpringCloudBus刷新配置,并动态自动同步刷新客户端配置。
     * 执行Post http://localhost:3344/actuator/bus-refresh,刷新配置同步到各个客户端。(原来的手动刷新需要在各个客户端分别刷新)
     * (4)Bus定点通知
     * 公式：http://localhost:配置中心的端口号/actuator/bus-refresh/{destination}
     * 例如：只通知3355，curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355" (微服务名称:端口号)
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenterMain3344.class, args);
        System.out.println("启动成功");
    }
}
