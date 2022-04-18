package com.java.ccs.springcloud.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:04 2022/4/18
 */
@Configuration
public class GateWayConfig {

    /**
     * 使用代码的方式，配置网关路由。
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 模拟通过网关访问百度网站,当访问(http://localhost:9527/guonei)时会自动转发到地址(http://news.baidu.com/guonei)
        routes.route("path_route_gateway_baidu", (r) -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 模拟通过网关访问百度网站,当访问(http://localhost:9527/guoji)时会自动转发到地址(http://news.baidu.com/guoji)
        routes.route("path_route_gateway_baidu", (r) -> r.path("/guoji").uri("http://news.baidu.com/guoji"))
                .build();
        return routes.build();
    }

}
