package com.java.ccs.springcloud.alibaba.controller;

import com.java.ccs.springcloud.alibaba.entity.CommonResult;
import com.java.ccs.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:33 2022/4/27
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功！");
    }
}
