package com.java.ccs.springcloud.service;

/**
 * @Author: Cao.cs
 * @Date: Created in 11:20 2022/4/23
 */
public interface IMessageProvider {

    /**
     * 定义消息的推送管道
     */
    String send();

}
