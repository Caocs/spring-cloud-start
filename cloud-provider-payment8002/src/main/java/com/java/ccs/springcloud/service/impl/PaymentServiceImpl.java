package com.java.ccs.springcloud.service.impl;


import com.java.ccs.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.java.ccs.springcloud.dao.PaymentDao;
import com.java.ccs.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:14 2022/3/18
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
