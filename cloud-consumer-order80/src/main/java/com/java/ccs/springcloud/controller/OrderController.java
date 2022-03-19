package com.java.ccs.springcloud.controller;

import com.java.ccs.springcloud.entities.CommonResult;
import com.java.ccs.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: Cao.cs
 * @Date: Created in 12:28 2022/3/19
 */
@RestController
@Slf4j
public class OrderController {

    /**
     * (1)单机版时，指定IP没问题。（http://localhost:8001）
     * (2)但是集群时，指定应用名。（http://CLOUD-PAYMENT-SERVICE）(大写，因为注册到Eureka上的应用名为大写)
     * 同时，需要开启RestTemplate的负载均衡。
     * Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号，且该服务还有负载功能了。
     */
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    /**
     * http://localhost/consumer/payment/create?serial=11111
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Integer> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/search/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/search/" + id, CommonResult.class);
    }

}
