package com.example.demo.business.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="emp_company_tbl")
@NamedQuery(name="EmpCompany.findAll", query="SELECT e FROM EmpCompany e")
@Setter @Getter
public class EmpCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_company_id")
	private int empCompanyId;

	@Column(name="company_id")
	private int companyId;

	@Column(name="employee_id")
	private int employeeId;
	
}
