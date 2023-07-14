package com.jsp.spring_anotation_xml.method;

import org.springframework.stereotype.Component;

@Component(value = "details")
public class MyDeatails {
	public void displayMydetails() {
		System.out.println("This is my folder");
	}
}
