package com.kp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kp.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {



}