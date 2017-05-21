package org.hrd.kotlin.kotlin.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan(basePackages="org.hrd.kotlin.kotlin.controllers.rest")
public class SwaggerConfiguration {

	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()   
          .apis(RequestHandlerSelectors.basePackage("org.hrd.kotlin.kotlin.controllers"))
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())
          .build()
          .apiInfo(apiInfo());                                           
    } 
	
	
	
	private ApiInfo apiInfo() {
	    @SuppressWarnings("deprecation")
	    ApiInfo apiInfo = new ApiInfo(
	      "API DATA JPA",
	      "WE'RE GONNA MAKE OUR COUNTRY A BETTER PLACE BY STARTING FROM US TONIGHT.",
	      "BACK END API V1",
	      "Terms of service",
	      "maslanh.com",
	      "License of SOTECH(maslanh.com)",
	      "API license joul.maslanh.com");
	    return apiInfo;
	}
}
