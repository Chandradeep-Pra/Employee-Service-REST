package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;

import com.nissan.service.IEmployeeService;

@RestController
@RequestMapping("task/")
public class EmpController {
	
	@Autowired
	IEmployeeService empService;
	
	//List all Employees
	@GetMapping("allemployee")
	public List<Employee> findAllEmployees(){
		return empService.findAllEmployees();
	}
	
	//Add employee
	@PostMapping("employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		System.out.println("Inserting Record");
		return new ResponseEntity<Employee> (empService.addEmployee(employee),HttpStatus.OK);
		
		
	}
	
	//Edit employee record
	@PutMapping("employees")
	public void editEmployee(@RequestBody Employee employee) {
		System.out.println("Edit record");
		empService.editEmployee(employee);
	}
	
	//Delete an employee
	
	
}
