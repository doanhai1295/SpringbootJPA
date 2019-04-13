package com.example.demo.business.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	//bi-directional many-to-one association to Company
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="company_id")
	@JsonIgnore
	private Company company;

	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id")
	@JsonIgnore
	private Employee employee;

}
