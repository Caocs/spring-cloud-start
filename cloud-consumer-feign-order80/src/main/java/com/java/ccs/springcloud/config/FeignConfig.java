package com.java.ccs.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Cao.cs
 * @Date: Created in 20:34 2022/3/20
 */
@Configuration
public class FeignConfig {

    /**
     * NONE,
     * BASIC,
     * HEADERS,
     * FULL;
     *
     * @return 日志级别
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
