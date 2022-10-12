package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tblDepartment")
public class Department {
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;

	// Instance variable for One dept many User
	// Making one to many reelation since one dept many user
	@JsonIgnore
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL) // One dept many Employees
	private List<Employee> Employees;

	// default constructor
	public Department() {

	}

	// parameterized constructor
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	// getters and setters
	public int getdeptId() {
		return deptId;
	}

	public void setdeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getdeptName() {
		return deptName;
	}

	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return Employees;
	}

	public void setEmployees(List<Employee> employees) {
		Employees = employees;
	}

	// override two string
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", Employees=" + Employees + "]";
	}

}
