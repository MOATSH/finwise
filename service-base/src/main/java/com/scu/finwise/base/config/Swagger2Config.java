package com.scu.finwise.base.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Program: finwise
 * @Description: swagger2配置文件
 * @Author: MOATSH
 * @Create: 2023-10-26 13:22
 **/

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket adminApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("adminApi").apiInfo(this.adminApiInfo())
                .select().paths(Predicates.and(PathSelectors.regex("/admin/.*"))).build();
    }

    @Bean
    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("webApi").apiInfo(this.webApiInfo())
                .select().paths(Predicates.and(PathSelectors.regex("/api/.*"))).build();
    }

    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder().title("Financial Wise后台管理系统API文档")
                .description("本文档描述了Financial Wise项目后台管理系统的各个接口的调用方式")
                .version("1.0")
                .contact(new Contact("MOATSH", "--", "oatshm@gmail.com"))
                .build();
    }

    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder().title("Financial Wise网站API文档")
                .description("本文档描述了Financial Wise项目网站各模块的各个接口的调用方式")
                .version("1.0")
                .contact(new Contact("MOATSH", "--", "oatshm@gmail.com"))
                .build();
    }

}
