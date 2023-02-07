package com.zhiweicoding.nacos.controller;

import com.zhiweicoding.nacos.config.ProjectConfig;
import com.zhiweicoding.nacos.service.NacosClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author by diaozhiwei on 2023/02/07.
 * @email diaozhiwei2k@163.com
 */
@Slf4j
@RestController
@RequestMapping("/nacosClient")
public class NacosClientController {

    @Resource
    public ProjectConfig projectConfig;
    @Resource
    public NacosClientService nacosClientService;

    /**
     * <h2>根据 service id 获取服务所有的实例信息</h2>
     */
    @GetMapping("/serviceInstance")
    public List<ServiceInstance> serviceInstance(@RequestParam(defaultValue = "thought-nacos-client") String serviceId) {
        log.info("coming in log nacos client info: [{}]", serviceId);
        return nacosClientService.getNacosClientInfo(serviceId);
    }

    /**
     * <h2>动态获取nacos配置的</h2>
     *
     * @return {@link ProjectConfig}
     */
    @GetMapping("/projectConfig")
    public ProjectConfig getProjectConfig() {
        return projectConfig;
    }
}
