package com.jsp.spring_anotation_xml.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		Customer customer = (Customer) applicationContext.getBean("customer");
		customer.display();

	}

}
