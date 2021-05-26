package com.wang.ordering.util.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
// 指定扫描的api包路径
@ComponentScan(basePackages = {"com.wang.ordering.controller"})
//注解开启 swagger2 功能
@EnableSwagger2
public class Swagger2Config {

    @Value("${swagger2.enable}")
    boolean enable;
    // 配置文件中通过值注入控制生产环境与开发环境下的启用状态

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enable)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("点单平台 | 点单系统 API文档")//标题
                .description("description: 点单 | 点单系统 API文档")//描述
                .version("1.0.0")//版本号
                .build();
    }

}