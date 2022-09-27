package com.infosys.userinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infosys.configuration.SpringConfig;

public class Tester {

	public static void main(String[] args) {


		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Environment env=context.getEnvironment();
        System.out.println(env.getProperty("message"));
        System.out.println(env.getProperty("data"));
        System.out.println(env.getProperty("str"));
	}

}
