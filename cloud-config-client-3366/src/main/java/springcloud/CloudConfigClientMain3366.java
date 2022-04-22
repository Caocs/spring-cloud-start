package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:10 2022/4/20
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClientMain3366 {

    /**
     * Spring Cloud Bus消息总线有两种架构设计,
     * (1)利用消息总线触发一个客户端/bus/refresh,而刷新所有客户端的配置。
     * (2)利用消息总线触发一个服务端ConfigServer的/bus/refresh端点,而刷新所有客户端的配置。
     * 显然架构(2)更加合适。
     * <p>
     * 架构(1)不合理的原因：
     * (1)破坏了微服务的职责单一性，微服务本身是业务模块，不应该承担配置刷新的职责。
     * (2)破坏微服务各个节点的对等性。
     * (3)网络地址经常发生变动。
     * <p>
     * (3)使用SpringCloudBus刷新配置,并动态自动同步刷新客户端配置。
     * 执行Post http://localhost:3344/actuator/bus-refresh,刷新配置同步到各个客户端。(原来的手动刷新需要在各个客户端分别刷新)
     * (4)Bus定点通知
     * 公式：http://localhost:配置中心的端口号/actuator/bus-refresh/{destination}
     * 例如：只通知3355，curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientMain3366.class, args);
        System.out.println("启动成功");
    }
}
