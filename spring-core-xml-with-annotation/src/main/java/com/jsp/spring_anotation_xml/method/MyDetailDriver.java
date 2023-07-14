package com.jsp.spring_anotation_xml.method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDetailDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		MyDeatails myDeatails = (MyDeatails) applicationContext.getBean("details");
		myDeatails.displayMydetails();

	}

}
