package com.dota2apiclient.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.*;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;

/**
 * Created by Admin on 11.02.2016.
 */

//@Configuration
//@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    public SpringResourceTemplateResolver getTemplateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("/resources/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        return resolver;
    }

    @Bean
    public SpringTemplateEngine getTemplateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        return engine;
    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/home").setViewName("index");
        //registry.addViewController("/").setViewName("index");
        //registry.addViewController("/hello").setViewName("index");
        //registry.addViewController("/login").setViewName("login");
    }
}
