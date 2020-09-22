package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@RequestMapping("/healthCheck")
	public String getEmployee() {
		return "DemoApplication OK!";
	}
	
}
