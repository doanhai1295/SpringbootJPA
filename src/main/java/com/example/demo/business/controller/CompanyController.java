package com.example.demo.business.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.system.data.ResponseDataConfig;

@RestController
public class CompanyController {

	@SuppressWarnings("rawtypes")
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity retrieveAllStudents() {
		return ResponseDataConfig.success("OK", HttpStatus.OK);
	}
}
