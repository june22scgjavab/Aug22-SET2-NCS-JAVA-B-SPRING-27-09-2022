package com.infosys.userinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.Address;
import com.infosys.beans.Employee;
import com.infosys.configuration.SpringConfiguration;



public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);	
	    Employee employee=context.getBean(Employee.class);
	    Address address=employee.getAddress();
	    address.sethNo(111);
	    address.setLocality("Netaji Nagar");
	    address.setCity("Delhi");
	    employee.setEmpId(1);
	    employee.setName("Juben");
	    System.out.println(employee.getEmpId());
	    System.out.println(employee.getName());
	    System.out.println(address.gethNo());
	    System.out.println(address.getLocality());
	    System.out.println(address.getCity());
	}

}
