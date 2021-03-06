package com.kp.service;

import java.util.List;
import java.util.Optional;

import com.kp.entity.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(int empId);
	Optional<Employee> getEmployee(int empId);
	Iterable<Employee> getAllEmployee();

}
