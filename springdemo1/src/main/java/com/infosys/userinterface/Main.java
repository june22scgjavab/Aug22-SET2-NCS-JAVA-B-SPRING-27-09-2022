package com.infosys.userinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.HelloWorld;
import com.infosys.configuration.SpringConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        HelloWorld hw=context.getBean(HelloWorld.class);
        hw.greet();
      
        
	}

}
