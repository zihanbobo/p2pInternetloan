package com.p2pInternetloan.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: 这是Swagger的配置类
 * @Author: cpc
 * @Date: 2019-10-09 7:41
 * @Version: V1.0
 */
/*重要！如果你的项目引入junit测试，此处需要使用@WebAppConfiguration，如果没有使用junit使用@Configuration(很多的博客都没有注明这个问题，为此我花了非常多的时间解决问题)*/
@WebAppConfiguration
@EnableSwagger2//重要！
@EnableWebMvc
@ComponentScan(basePackages = "com.p2pInternetloan.base.controller")//扫描control所在的package请修改为你control所在package
//如果要访问的话直接访问 http://localhost:8080/项目名称/swagger-ui.html 就看到文档了
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 这是匹配api的信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //大标题
                .title("p2p网贷项目接口文档")
                //描述
                .description("p2p网贷项目接口测试")
                // 版本号
                .version("1.0.0")
                
                .termsOfServiceUrl("")
                .license("")
                .licenseUrl("")
                .build();
    }
}
