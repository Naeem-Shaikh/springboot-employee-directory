package com.naeem.employeedirectory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naeem.employeedirectory.model.Employee;
import com.naeem.employeedirectory.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> findAll() {

		return employeeRepo.findAll();
	}

	

}
