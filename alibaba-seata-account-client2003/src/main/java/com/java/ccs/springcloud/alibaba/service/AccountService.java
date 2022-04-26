package com.java.ccs.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:41 2022/4/27
 */
public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
