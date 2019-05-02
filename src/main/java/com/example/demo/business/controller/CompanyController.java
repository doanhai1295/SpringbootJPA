package com.example.demo.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.service.CompanyService;
import com.example.demo.system.data.ResponseDataConfig;

@RestController
public class CompanyController {

	@Autowired
	CompanyService companyService;
	@SuppressWarnings("rawtypes")
	@GetMapping("/companys")
	@ResponseBody
	public ResponseEntity retrieveAllStudents() {
		return ResponseDataConfig.success(companyService.getEmployees(), HttpStatus.OK);
	}
}
