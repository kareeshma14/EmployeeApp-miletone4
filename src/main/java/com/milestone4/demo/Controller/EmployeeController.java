package com.milestone4.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.milestone4.demo.Entity.Employee;
import com.milestone4.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	public List<Employee> getEmployees(){
		return service.getAll();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getById(id);
	}
}
