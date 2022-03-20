package com.java.ccs.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:22 2022/3/19
 */
@RestController
public class OrderController {

    /**
     * zookeeper服务中心的服务名称(小写)
     * 在zookeeper中services节点下，存放服务名临时节点。
     */
    public static final String INVOKE_URL = "http://consul-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }

}
