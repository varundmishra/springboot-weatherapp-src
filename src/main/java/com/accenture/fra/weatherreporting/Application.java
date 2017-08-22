package com.accenture.fra.weatherreporting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan
@Configuration
@EnableAutoConfiguration
public class Application  extends WebMvcConfigurerAdapter{
    

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/fra/js/**")
        .addResourceLocations("classpath:/public/js/");

	    registry.addResourceHandler("/fra/css/**")
        .addResourceLocations("classpath:/public/css/");

	    registry.addResourceHandler("/fra/images/**")
        .addResourceLocations("classpath:/public/images/");
	    
	    registry.addResourceHandler("/fra/fonts/**")
        .addResourceLocations("classpath:/public/fonts/");
	}
	
	

}
