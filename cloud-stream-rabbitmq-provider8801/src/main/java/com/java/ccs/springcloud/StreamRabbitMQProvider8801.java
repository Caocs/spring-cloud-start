package com.java.ccs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cao.cs
 * @Date: Created in 10:59 2022/4/23
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitMQProvider8801 {

    /**
     * (1)消息驱动Stream中的常用API和注解
     * Middleware:中间件,目前只支持RabbitMQ和Kafka
     * Binder:Binder是应用与消息中间件之间的封装，目前实行了Kafka和RabbitMQ的Binder,通过Binder可以很方便的连接中间件,可以动态的改变消息类型。
     *
     * @Input 注解表示输入通道, 通过该输入通道接收到的消息进入应用程序
     * @Output 注解标识输出通道，发布的消息将通过该通道历来应用程序
     * @StreamListener 监听队列，用于消费者的队列的消息接收
     * @EnableBinding 指信道channel和exchange绑定在一起
     * <p>
     * (2)消息重复消费问题
     * 默认Stream消息发送的消费者在不同分组中，会导致重复消费问题。
     * 在Stream中处于同一个group中的多个消费者是竞争关系，就能保证消息只会被其中一个应用消费一次。
     * 在接收消息端设置group: group_same_a # 设置同一个分组名,解决重复消费问题
     * <p>
     * (3)消息持久化
     * 在接收消息端设置group,即会进行消息持久化。
     */
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMQProvider8801.class, args);
        System.out.println("启动成功");
    }

}
