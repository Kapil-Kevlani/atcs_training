package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Employee;
import com.ia.service.EmployeeService;

@SpringBootTest
class SpringDemo1ApplicationTests {
	
	@Autowired
	EmployeeService service;

	//EmployeeService service;
//	@Test
//	
//	void testAddEmployee() {
//		Employee employee = new Employee(111,"mehul", 1520,"jaipur");
//		Employee emp = service.addEmployee(employee);
//		assertEquals(emp.getEmpName(), "mehul");
//		
//	}
//@Test
//	
//	void testupdateEmployee() {
//		Employee employee = new Employee(111,"kapil", 1520,"jaipur");
//		Employee emp = service.addEmployee(employee);
//		assertEquals(emp.getEmpName(), "kapil");
//		
//	}
//	
@Test
void testGetAllEmployee() {
	List<Employee>emp=service.getAllEmployee();
	assertTrue(emp.size()>0);
}
}
