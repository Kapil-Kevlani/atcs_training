package com.kk.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kk.dao.EmployeeDao;
import com.kk.entity.Employee;
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
	public String deleteEmployee(int empId) {
		
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
