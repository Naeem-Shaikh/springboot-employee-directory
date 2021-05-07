package com.naeem.employeedirectory.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naeem.employeedirectory.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
