package com.jsp.spring_anotation_xml.setter;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		Product product = (Product) applicationContext.getBean("product");
		System.out.println("id=" + product.getId());
		System.out.println("name =" + product.getName());
		System.out.println("price =" + product.getPrice());
	}

}
