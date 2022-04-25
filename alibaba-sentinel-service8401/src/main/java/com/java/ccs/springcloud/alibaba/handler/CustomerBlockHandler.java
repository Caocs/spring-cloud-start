package com.java.ccs.springcloud.alibaba.handler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.java.ccs.springcloud.entities.CommonResult;


/**
 * @Author: Cao.cs
 * @Date: Created in 22:10 2022/4/25
 * 自定义限流处理类
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }


    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
