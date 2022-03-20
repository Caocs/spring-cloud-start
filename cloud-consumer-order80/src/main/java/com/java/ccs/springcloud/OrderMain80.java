package com.java.ccs.springcloud;

import com.java.ccs.ribbon.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 12:20 2022/3/19
 * @RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyRuleConfig.class)：启动该服务时去加载自定义的ribbon配置
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyRuleConfig.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
