package com.java.ccs.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Cao.cs
 * @Date: Created in 13:41 2022/3/20
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentZookeeper() {
        return "Spring Cloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
