package com.kyrie.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/1 12:07
 */
@Configuration
public class SwaggerConfig {
    /**
     * 配置swagger的Docket bean
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30) // 指定swagger3.0版本
                .apiInfo(createApiInfo());
    }

    /**
     * 配置swagger的ApiInfo bean
     */
    @Bean
    public ApiInfo createApiInfo() {
        return new ApiInfo(
                "乐自居接口测试",
                "Swagger3 Api interface test",
                "1.0",
                "http://www.baidu.com",
                new Contact("小度", "http://www.baidu.com", "whatisjava4s@163.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>()
        );
    }
}

