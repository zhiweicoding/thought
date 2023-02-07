package com.zhiweicoding.nacos.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author by diaozhiwei on 2023/02/07.
 * @email diaozhiwei2k@163.com
 */
@Service
@Slf4j
public class NacosClientService {

    @Resource
    private DiscoveryClient discoveryClient;

    public List<ServiceInstance> getNacosClientInfo(String serviceId) {
        log.info("request nacos client to get service instance info: [{}]", serviceId);
        return discoveryClient.getInstances(serviceId);
    }
}
