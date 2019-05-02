package com.example.demo.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_tbl")
@NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
@Setter
@Getter
//@JsonIdentityInfo(
//		  generator = ObjectIdGenerators.PropertyGenerator.class, 
//		  property = "employeeId")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "addr_mail")
	private String addrMail;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(name = "deleted_flag")
	private byte deletedFlag;

	@Column(name = "full_name")
	private String fullName;

	private String gender;

	@Column(name = "phone_number")
	private String phoneNumber;

	@ManyToMany(mappedBy = "employees")
	private Set<Company> companys = new HashSet<Company>();

}
