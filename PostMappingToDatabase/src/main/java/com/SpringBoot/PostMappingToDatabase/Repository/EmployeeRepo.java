package com.SpringBoot.PostMappingToDatabase.Repository;

import com.SpringBoot.PostMappingToDatabase.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
