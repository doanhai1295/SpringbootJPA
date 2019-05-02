package com.example.demo.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.model.Company;
import com.example.demo.business.repository.CompanyRepository;
import com.example.demo.business.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public List<Company> getEmployees() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}

}