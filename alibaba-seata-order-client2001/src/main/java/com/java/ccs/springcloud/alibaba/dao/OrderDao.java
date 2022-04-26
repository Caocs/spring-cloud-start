package com.java.ccs.springcloud.alibaba.dao;

import com.java.ccs.springcloud.alibaba.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:48 2022/4/27
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
