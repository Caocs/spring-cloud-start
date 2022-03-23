package com.java.ccs.springcloud.service.impl;

import com.java.ccs.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Author: Cao.cs
 * @Date: Created in 20:47 2022/3/23
 * PaymentHystrixService对应的服务降级时的处理类。
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

}
