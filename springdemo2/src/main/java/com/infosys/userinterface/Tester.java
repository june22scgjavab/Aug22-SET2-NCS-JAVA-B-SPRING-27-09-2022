package com.infosys.userinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.Calculator;
import com.infosys.configuration.SpringConfig;

public class Tester {

	public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
	Calculator calc=(Calculator)applicationContext.getBean("mycalculator");//The return type is Object type so we have to typecast
	calc.setNumber1(1);
	calc.setNumber2(10);
	System.out.println(calc.add());

	}

}
