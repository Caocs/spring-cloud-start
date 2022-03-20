package com.java.ccs.springcloud.controller;

import com.java.ccs.springcloud.config.lb.LoadBalancer;
import com.java.ccs.springcloud.entities.CommonResult;
import com.java.ccs.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 12:28 2022/3/19
 */
@RestController
@Slf4j
public class OrderController {

    /**
     * (1)单机版时，指定IP没问题。（http://localhost:8001）
     * (2)但是集群时，指定应用名。（http://CLOUD-PAYMENT-SERVICE）(大写，因为注册到Eureka上的应用名为大写)
     * 同时，需要开启RestTemplate的负载均衡。
     * Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号，且该服务还有负载功能了。
     */
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;
    /**
     * 自定义的负载均衡算法实现
     */
    @Resource
    private LoadBalancer myLoadBalancer;
    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * http://localhost/consumer/payment/create?serial=11111
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Integer> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/search/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/search/" + id, CommonResult.class);
    }

    /**
     * restTemplate.getForObject()：返回对象为响应体中数据转换成的对象，基本上可以理解为Json。
     * restTemplate.getForEntity()：返回对象为ResponseEntity对象，包含了响应中的一些重要信息，比如响应头、响应状态码、响应体等。
     */
    @GetMapping("/consumer/payment/search/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> responseEntity = restTemplate.getForEntity(PAYMENT_URL + "/payment/search/" + id, CommonResult.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }
    }


    /**
     * @description 测试自定义的负载均衡规则
     * 注意：
     * 当测试该方法时，restTemplate注入时需要注释掉@LoadBalanced注解。（不在需要Ribbon的负载均衡）
     */
    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.isEmpty()) {
            return null;
        }
        // 调用自定义的负载均衡策略
        ServiceInstance serviceInstance = myLoadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/payment/lb", String.class);
    }

}
