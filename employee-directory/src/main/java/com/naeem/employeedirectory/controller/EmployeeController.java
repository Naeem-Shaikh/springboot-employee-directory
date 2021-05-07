package com.naeem.employeedirectory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naeem.employeedirectory.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/employees")
	public String homePage(Model model) {
		model.addAttribute("listEmployees", service.findAll());
		return "index";
	}
}
