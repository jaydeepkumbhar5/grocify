package com.grocify.storemgmt.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration /* @Configuration annotation in Spring Boot marks a class 
as a configuration class. This means the class will be used to define 
beans (Spring-managed objects) that are needed for your application */

public class CorsConfig {
    @Bean  /* @Bean annotation in Spring Boot is used to manually define 
    and create Spring-managed objects (beans). It is placed inside a 
    class annotated with @Configuration */
    
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override  /* @Override is commonly used to override methods 
            from interfaces or parent classes. */
            
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
            }
        };
    }
}
