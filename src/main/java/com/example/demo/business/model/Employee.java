package com.example.demo.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employee_tbl")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
@Setter @Getter
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="employee_id")
	private int employeeId;

	@Column(name="addr_mail")
	private String addrMail;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(name="deleted_flag")
	private byte deletedFlag;

	@Column(name="full_name")
	private String fullName;

	private String gender;

	@Column(name="phone_number")
	private String phoneNumber;

	//bi-directional many-to-one association to EmpCompany
	@OneToMany(mappedBy="employee")
	private List<EmpCompany> empCompanys;

	public EmpCompany addEmpCompany(EmpCompany empCompany) {
		getEmpCompanys().add(empCompany);
		empCompany.setEmployee(this);

		return empCompany;
	}

	public EmpCompany removeEmpCompany(EmpCompany empCompany) {
		getEmpCompanys().remove(empCompany);
		empCompany.setEmployee(null);

		return empCompany;
	}

}
