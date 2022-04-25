package com.java.ccs.springcloud.alibaba.controller;


import com.java.ccs.springcloud.alibaba.service.PaymentService;
import com.java.ccs.springcloud.entities.CommonResult;
import com.java.ccs.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Cao.cs
 * @Date: Created in 1:28 2022/4/26
 */
@RestController
@Slf4j
public class OpenFeignCircleBreakerController {

    @Resource
    private PaymentService paymentService;

    /**
     * 演示OpenFeign调用
     */
    @GetMapping(value = "/consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }
}
