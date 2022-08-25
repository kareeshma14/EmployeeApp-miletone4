package com.milestone4.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.milestone4.demo.Entity.Employee;

@Service
public class EmployeeService {
	private static List<Employee> em = new ArrayList<>();
	
	
	public EmployeeService() {
		em = putEmployees();
	}
	private List<Employee> putEmployees(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Ross", 5000));
		list.add(new Employee(102, "Rachel", 8000));
		list.add(new Employee(103, "Monica", 4000));
		list.add(new Employee(104, "Chandler", 6000));
		list.add(new Employee(105, "Joey",4000));
		list.add(new Employee(106, "Phoebe",1000));
		list.add(new Employee(107, "Klaus",2300));
		list.add(new Employee(108, "Hope",4070));
		list.add(new Employee(109, "Hailey",8770));
		list.add(new Employee(110, "Harrys",9890));
		return list;
	}
	public List<Employee> getAll() {
		return em;
	}
	public Employee getById(int id) {
		return em.stream().filter(x -> x.getId() == id).findFirst().get();
	}
	
}
