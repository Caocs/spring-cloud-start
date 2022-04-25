package com.java.ccs.springcloud.alibaba.service;

import com.java.ccs.springcloud.entities.CommonResult;
import com.java.ccs.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Cao.cs
 * @Date: Created in 1:23 2022/4/26
 */
@FeignClient(value = "sentinel-nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    /**
     * 使用OpenFeign远程调用"sentinel-nacos-payment-provider"服务的接口。
     */
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
