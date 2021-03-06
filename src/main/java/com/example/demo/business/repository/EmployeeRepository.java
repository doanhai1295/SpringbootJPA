package com.example.demo.business.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.business.dto.response.EmployeeResponse;
import com.example.demo.business.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	@Query("SELECT e FROM Employee e")
//	public List<Employee> getAllEmployee();
//
//	@Query("SELECT e FROM Employee e WHERE e.deletedFlag = :deletedFlag")
//	public List<Employee> getAllEmployeew(@Param("deletedFlag") byte deletedFlag);
//
//	public List<Employee> findByDeletedFlag(byte deletedFlag);
//
//	@Query("SELECT new com.example.demo.business.dto.response.EmployeeResponse(e.employeeId, e.addrMail, e.address) FROM Employee e")
//	public List<EmployeeResponse> getAllEmployeeResponse();
}
