package com.java.ccs.springcloud.service.impl;

import com.java.ccs.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author: Cao.cs
 * @Date: Created in 11:21 2022/4/23
 * @EnableBinding(Source.class) 定义消息的推送管道 将Channel和Exchanges绑定在一起
 */
@EnableBinding(Source.class)
public class MessageProvider implements IMessageProvider {
    /**
     * 消息发送管道/信道
     */
    @Resource
    private MessageChannel output;

    /**
     * 每次调用都向RabbitMQ中发送消息
     *
     * @return 流水号
     */
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString(); // 流水号
        Message<String> stringMessage = MessageBuilder.withPayload(serial).build();
        output.send(stringMessage);

        System.out.println("*****serial: " + serial);
        return serial;
    }
}