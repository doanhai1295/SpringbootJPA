package com.example.demo.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.dto.response.EmployeeResponse;
import com.example.demo.business.model.Employee;
import com.example.demo.business.repository.EmployeeRepository;
import com.example.demo.business.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getEmployees() {
		long startQuery = System.currentTimeMillis();
		List<Employee> employees = employeeRepository.findAll();
		long endQuery = System.currentTimeMillis();
		long timeQuery = endQuery - startQuery;
		
		long startQuery1 = System.currentTimeMillis();
		List<EmployeeResponse> employeeResponses =employeeRepository.getAllEmployeeResponse();
		long endQuery1 = System.currentTimeMillis();
		long timeQuery1 = endQuery1 - startQuery1;
		
		return employees;
	}

}
