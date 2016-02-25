package com.dota2apiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
@SpringBootApplication
public class WebAppTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppTryApplication.class, args);
	}
}
