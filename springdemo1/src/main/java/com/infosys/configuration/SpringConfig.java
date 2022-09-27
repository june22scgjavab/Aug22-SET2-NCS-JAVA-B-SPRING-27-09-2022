package com.infosys.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.beans.HelloWorld;

@Configuration
public class SpringConfig {
	
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	

}
