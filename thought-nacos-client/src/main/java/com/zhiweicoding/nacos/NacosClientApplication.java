package com.zhiweicoding.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author by diaozhiwei on 2023/02/07.
 * @email diaozhiwei2k@163.com
 */
@ComponentScan
@SpringBootConfiguration
@EnableDiscoveryClient
@RefreshScope
public class NacosClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientApplication.class, args);
    }
}
