package com.kk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.entity.Employee;
import com.kk.service.EmployeeService;

@RestController
@RequestMapping("/employee")//to get url http://localhost:8000/employee
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	//post>insert, get>get, put>update, delete>remove
	
	@PostMapping("/addEmployee")//to get url http://localhost:8000/employee/addEmployee
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
		
	}
	@PutMapping("/updateEmployee")//to get url http://localhost:8000/employee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
		
	}
	@GetMapping("/getEmployee/{eid}")//to get url http://localhost:8000/employee/getEmployee/eid
	public Employee getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee( empId);
		
	}
	@GetMapping("/getAllEmployee")//to get url http://localhost:8000/employee/getAllEmployee
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
		
	}
	@DeleteMapping("/deleteEmployee/{eid}")//to get url http://localhost:8000/employee/deleteEmployee/eid
	public String deleteEmployee(@PathVariable("eid") int empId) {
		return service.deleteEmployee(empId);
		
	}

}
