package com.java.ccs.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:36 2022/3/19
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentZookeeper() {
        return "Spring Cloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
