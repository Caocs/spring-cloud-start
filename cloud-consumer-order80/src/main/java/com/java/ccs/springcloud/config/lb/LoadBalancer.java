package com.java.ccs.springcloud.config.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 15:29 2022/3/20
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
