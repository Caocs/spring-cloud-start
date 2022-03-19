package com.java.ccs.springcloud.service;

import com.java.ccs.springcloud.entities.Payment;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:13 2022/3/18
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
