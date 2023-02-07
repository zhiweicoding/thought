package com.zhiweicoding.nacos.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * <h1>yaml中定义的数据配置</h1>
 * @author by diaozhiwei on 2023/02/07.
 * @email diaozhiwei2k@163.com
 */
@Data
@Component
@ConfigurationProperties(prefix = "project")
public class ProjectConfig {

    private String name;
    private String org;
    private String version;
    private String author;
}
