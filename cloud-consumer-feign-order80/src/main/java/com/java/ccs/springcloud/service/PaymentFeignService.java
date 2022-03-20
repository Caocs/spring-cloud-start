package com.java.ccs.springcloud.service;

import com.java.ccs.springcloud.entities.CommonResult;
import com.java.ccs.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Cao.cs
 * @Date: Created in 20:29 2022/3/20
 * @FeignClient(value = "CLOUD-PAYMENT-SERVICE")：指定需要调用的服务(注册到Eureka中的服务名)
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/search/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    /**
     * 用于演示耗时很长的接口的超时时间配置。
     * 在配置文件中设置。
     */
    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();

}
