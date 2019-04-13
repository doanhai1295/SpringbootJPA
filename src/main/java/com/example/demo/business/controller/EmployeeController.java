package com.example.demo.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.service.EmployeeService;
import com.example.demo.system.data.ResponseDataConfig;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/employees")
	@ResponseBody
	public ResponseEntity getAllEmployees() {
		return ResponseDataConfig.success(employeeService.getEmployees(), HttpStatus.OK);
	}
}
