package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:09 2022/4/20
 * @RefreshScope 实现热加载 自动获取刷新内容
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    /**
     * @return 将配置信息以Rest接口的形式暴露
     */
    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
