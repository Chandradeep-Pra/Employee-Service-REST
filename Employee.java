package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="tblEmployee")
public class Employee {
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	@Column(nullable = false, unique = true)
	private String empName;

	@Column(nullable = false)
	private String designation;

	private LocalDate doj;
	private boolean isActive;

	@JoinColumn(name = "deptId") // Employee.roleId = Department.roleId
	@ManyToOne
	private Department department;

	private int salary;
	
	private String phone;

	// default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Employee(int empId, String empName, String designation, LocalDate doj, boolean isActive,
			Department department, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.doj = doj;
		this.isActive = isActive;
		this.department = department;
		this.salary = salary;
		this.phone = phone;
	}

	// getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@JsonBackReference 
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	// override to string
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", doj=" + doj
				+ ", isActive=" + isActive + ", department=" + department + ", salary=" + salary + "]";
	}
}
