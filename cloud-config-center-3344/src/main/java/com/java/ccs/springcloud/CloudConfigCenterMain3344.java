package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:18 2022/4/19
 */
@SpringBootApplication
@EnableConfigServer // 配置中心服务端
public class CloudConfigCenterMain3344 {
    /**
     * (1)为了在windows下模拟，修改hosts文件，添加映射(127.0.0.1 config-3344.com)
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenterMain3344.class, args);
        System.out.println("启动成功");
    }
}
