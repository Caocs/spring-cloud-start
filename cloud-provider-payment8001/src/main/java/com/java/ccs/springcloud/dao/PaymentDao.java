package com.java.ccs.springcloud.dao;

import com.java.ccs.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:57 2022/3/18
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
