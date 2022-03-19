package com.java.ccs.springcloud.controller;

import com.java.ccs.springcloud.entities.CommonResult;
import com.java.ccs.springcloud.entities.Payment;
import com.java.ccs.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:17 2022/3/18
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入成功", result);
        } else {
            return new CommonResult<>(-1, "插入失败", result);
        }
    }

    @GetMapping("/payment/search/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        log.info("开始查询：");
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);
        if (payment != null) {
            return new CommonResult<>(200, "查询成功", payment);
        } else {
            return new CommonResult<>(-1, "未查询到", null);
        }
    }

}
