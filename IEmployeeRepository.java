package com.nissan.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.nissan.model.Employee;



public interface IEmployeeRepository extends JpaRepositoryImplementation<Employee, Integer> {
	
	// Spring data JPA  -- JpaRepositoryImplementation,CrudRepositoryImplementation
	
		//CustomRetrieve username and password
		
		
		@Query("from Employee where phone=?1 and isActive=True")
		public Employee findByPhone(String phone);
		
	
}
