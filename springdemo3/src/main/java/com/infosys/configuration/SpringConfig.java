 package com.infosys.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
   @ComponentScan(basePackages="com.infosys.beans")  // This annotation is used to inform the IOC container that the class which is
       // annoted with @Component is available within the backage com.infosys.beans
   public class SpringConfig {	}