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
     * 也可以不配置(访问http://localhost:3344/master/config-dev.yml)
     * 配置模板：/{label}/{application}-{profile}.yml
     * (2)本来想使用github的，奈何访问速度实在感人，最终放弃。改用Gitee。
     * https://gitee.com/cscao/spring-cloud-config-repository.git
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenterMain3344.class, args);
        System.out.println("启动成功");
    }
}
