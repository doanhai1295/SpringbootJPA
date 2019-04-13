package com.example.demo.business.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="company_tbl")
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
@Setter @Getter
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="company_id")
	private int companyId;

	private String address;

	@Column(name="company_name")
	private String companyName;

	@Column(name="deleted_flag")
	private byte deletedFlag;

	private String description;

	@Column(name="year_established")
	private int yearEstablished;

	//bi-directional many-to-one association to EmpCompanyTbl
	@OneToMany(mappedBy="company")
	private List<EmpCompany> empCompanys;

	public EmpCompany addEmpCompany(EmpCompany empCompany) {
		getEmpCompanys().add(empCompany);
		empCompany.setCompany(this);

		return empCompany;
	}

	public EmpCompany removeEmpCompany(EmpCompany empCompany) {
		getEmpCompanys().remove(empCompany);
		empCompany.setCompany(null);

		return empCompany;
	}
}
