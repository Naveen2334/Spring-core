package com.jsp.spring_anotation_xml.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "product")
public class Product {
	private int id;
	private String name;
	private double price;

	public int getId() {
		return id;
	}

	@Value(value = "123")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Value(value = "Nokia")
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	@Value(value = "140000")
	public void setPrice(double price) {
		this.price = price;
	}

}
