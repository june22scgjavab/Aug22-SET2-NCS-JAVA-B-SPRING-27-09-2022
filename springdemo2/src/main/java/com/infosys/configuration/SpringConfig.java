package com.infosys.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.beans.Calculator;

@Configuration
public class SpringConfig {
     @Bean(name="mycalculator")  // If we are not mentioning the name in that case we have to provide the method name 
                                 // If we are not using the class as parameter to getBean method
	 public Calculator calculator() {
		 return new Calculator();
	 }
}
