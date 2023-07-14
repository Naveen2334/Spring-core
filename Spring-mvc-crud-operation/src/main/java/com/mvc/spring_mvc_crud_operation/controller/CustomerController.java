package com.mvc.spring_mvc_crud_operation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	@RequestMapping(value="/getData")
	public String getStringData() {
		return "Good...morning";
	}

}
