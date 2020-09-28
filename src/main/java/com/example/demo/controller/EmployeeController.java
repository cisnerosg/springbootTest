package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Tag(name = "Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService eservice;
	
	@RequestMapping("/healthCheck")
	public ResponseEntity<String> gethealthCheck() {
		return ResponseEntity.ok("DemoApplication OK!");
	}
	
	@Operation(summary = "Get employees", description = "Get employees")
	@RequestMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees(){
		return  ResponseEntity.ok(eservice.getEmployees()); 
	}
	
	@RequestMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		return  ResponseEntity.ok(eservice.getEmployeebyId(id)); 
	}
	
}
