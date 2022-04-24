package com.java.ccs.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:49 2022/4/25
 * Sentinel流量控制和服务降级测试
 * (1)流控管理(https://github.com/alibaba/Sentinel/wiki/%E6%B5%81%E9%87%8F%E6%8E%A7%E5%88%B6)
 * 1.阈值类型：
 * --QPS：每秒的请求数量，当调用该API的QPS达到阈值的时候进行限流
 * --线程数：当调用该API的线程数达到阈值的时候进行限流
 * 2.流控模式：
 * --直接：API达到限流条件时，直接限流。
 * --关联：当关联的资源达到阈值时，就限流自己。
 * --链路：只针对指定链路上里流量
 * 3.流控效果：
 * --快速失败：直接失败，抛出异常。
 * --预热：根据冷加载因子(codeFactor,默认3)的值，从阈值/codeFactor，经过预热市场，才打到设定的QPS阈值。
 * --等待队列：排序等待执行，漏桶算法，适用于间歇性流量的消息队列。
 * <p>
 * (2)降级管理(https://github.com/alibaba/Sentinel/wiki/%E7%86%94%E6%96%AD%E9%99%8D%E7%BA%A7)
 * 降级策略(衡量资源是否处于稳定的状态)
 * 1.平均响应时间(RT)
 * 2.异常比例
 * 3.异常数
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        // 测试阈值类型：线程数
        /*try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "------testB";
    }

    @GetMapping("/testC")
    public String testC() {
        log.info("testC 异常比例");
        int age = 10 / 0;
        return "------testC";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常数");
        int age = 10 / 0;
        return "------testE 测试异常数";
    }


}
