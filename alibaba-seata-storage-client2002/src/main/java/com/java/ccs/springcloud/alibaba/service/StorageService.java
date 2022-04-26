package com.java.ccs.springcloud.alibaba.service;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:32 2022/4/27
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
