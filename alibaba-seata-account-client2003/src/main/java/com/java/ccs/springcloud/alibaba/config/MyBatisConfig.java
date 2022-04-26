package com.java.ccs.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:34 2022/4/27
 */
@Configuration
@MapperScan({"com.java.ccs.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
