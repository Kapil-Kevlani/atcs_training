package com.kk.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.kk.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@PersistenceContext
	EntityManager entity;
	
	@Override
	public Employee addEmployee(Employee employee) {
		entity.persist(employee);
		return entity.find(Employee.class, employee.getEmpid());
	}
	@Override
	public String deleteEmployee(int empId) {
		Employee emp=entity.find(Employee.class, empId);
		if(emp!=null) {
			entity.remove(emp);
			return "employee deleted";
		}
		else {
		return "no employee found";
		}
	}
	@Override
	public List<Employee> getAllEmployee() {
		TypedQuery<Employee> result=entity.createQuery("select e from Employee e", Employee.class);
		return result.getResultList();
	}
	@Override
	public Employee getEmployee(int empId) {
		
		return entity.find(Employee.class, empId);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return entity.merge(employee);
	}
	

}
