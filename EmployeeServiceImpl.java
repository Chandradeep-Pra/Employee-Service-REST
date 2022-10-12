package com.nissan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nissan.model.Employee;
import com.nissan.repo.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	// Field injection
	IEmployeeRepository emplRepo;

	// find all employees
	@Override
	public List<Employee> findAllEmployees() {

		return (List<Employee>) emplRepo.findAll();
	}

	// Add employee
	@Override
	public Employee addEmployee(Employee employee) {
		return emplRepo.save(employee);
	}

	// Edit employee
	@Override
	public Employee editEmployee(Employee employee) {
		return emplRepo.save(employee);

	}
	
	//Deleting an employee
	@Override
	public void deleteEmployee(Employee employee) {
		emplRepo.delete(employee);
	}
	
	//Find employee by phone
	@Override
	public Employee findByPhone(String phone) {
		Employee _employee = emplRepo.findByPhone(phone);
		if (phone.equals(_employee.getPhone())) {
			return _employee;
		} else {
			return null;
		}
	}

}
