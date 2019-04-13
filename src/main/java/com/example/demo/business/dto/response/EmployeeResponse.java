package com.example.demo.business.dto.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeResponse {

	private int employeeId;

	private String addrMail;

	private String address;

	private Date birthday;

	private byte deletedFlag;

	private String fullName;

	private String gender;

	private String phoneNumber;

	public EmployeeResponse(int employeeId, String addrMail, String address) {
		this.employeeId = employeeId;
		this.addrMail = addrMail;
		this.address = address;
	}
	
}
