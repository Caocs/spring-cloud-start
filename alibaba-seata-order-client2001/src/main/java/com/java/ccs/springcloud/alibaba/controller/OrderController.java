package com.java.ccs.springcloud.alibaba.controller;

import com.java.ccs.springcloud.alibaba.entity.CommonResult;
import com.java.ccs.springcloud.alibaba.entity.Order;
import com.java.ccs.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:53 2022/4/27
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
