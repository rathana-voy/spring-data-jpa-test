package org.hrd.kotlin.kotlin.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@Import(SwaggerConfiguration.class)
@EnableSwagger2

public class WebMvcCongfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**")
	.allowedMethods("GET","POST","DELETE","PUT","OPTIONS","PATCH")
	.allowedOrigins("*");
	}


//	Swagger Configuration 
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

	registry.addRedirectViewController("/v2/api-docs", "/v2/api-docs");
	registry.addRedirectViewController("/swagger-resources/configuration/ui","/swagger-resources/configuration/ui");
	registry.addRedirectViewController("/swagger-resources/configuration/security","/swagger-resources/configuration/security");
	registry.addRedirectViewController("/swagger-resources", "/swagger-resources");
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	registry.addResourceHandler("/**").addResourceLocations("/").setCachePeriod(0);
	registry.addResourceHandler("swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
}
