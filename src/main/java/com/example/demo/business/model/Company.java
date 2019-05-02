package com.example.demo.business.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "company_tbl")
@NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
@Setter
@Getter
//@JsonIdentityInfo(
//		  generator = ObjectIdGenerators.PropertyGenerator.class, 
//		  property = "companyId")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "company_id")
	private int companyId;

	private String address;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "deleted_flag")
	private byte deletedFlag;

	private String description;

	@Column(name = "year_established")
	private int yearEstablished;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "emp_company_tbl", joinColumns = { @JoinColumn(name = "company_id") }, inverseJoinColumns = {
			@JoinColumn(name = "employee_id") })
	private Set<Employee> employees = new HashSet<Employee>();

}
