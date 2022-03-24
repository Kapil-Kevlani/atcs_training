package com.ia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.dao.EmployeeDao;
import com.ia.entity.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;
	@Override
	public Employee addEmployee(Employee employee) {
		
		return dao.addEmployee(employee);
	}
	@Override
	public Employee deleteEmployee(int empId) {
		
		return null;
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return dao.getAllEmployee();
	}
	@Override
	public Employee getEmployee(int empId) {
		
		return dao.getEmployee(empId);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		
		return dao.updateEmployee(employee);
	}

}
