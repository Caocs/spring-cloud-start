package com.java.ccs.springcloud.alibaba.entity;

import lombok.Data;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:29 2022/4/27
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
