package com.example.demo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService eservice;
	
	@Test
	public void getEmployeesTest(){
		List<Employee> list = eservice.getEmployees();
		assertEquals(2, list.size());
	}
	
	@Test
	public void getEmployeeByIdTest(){
		Employee e = eservice.getEmployeebyId(1);
		assertEquals(1, e.getId());
	}
	
}
