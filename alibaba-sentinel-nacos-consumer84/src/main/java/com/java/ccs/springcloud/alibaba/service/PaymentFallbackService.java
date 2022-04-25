package com.java.ccs.springcloud.alibaba.service;

import com.java.ccs.springcloud.entities.CommonResult;
import com.java.ccs.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: Cao.cs
 * @Date: Created in 1:24 2022/4/26
 */
@Component
public class PaymentFallbackService implements PaymentService {
    /**
     * 使用OpenFeign远程调用时,异常兜底Fallback处理。
     */
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }

}
