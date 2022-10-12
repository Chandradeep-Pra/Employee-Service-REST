package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;

public interface IEmployeeService {

	// Get All Employees
	List<Employee> findAllEmployees();

	// Add an Employee
	Employee addEmployee(Employee employee);

	// Edit an Employee
	Employee editEmployee(Employee employee);

	// Delete an Employee
	void deleteEmployee(Employee employee);

	// Search By Phone
	Employee findByPhone(String phone);
}
