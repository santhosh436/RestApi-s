package com.SpringBoot.PostMappingToDatabase.Service;

import com.SpringBoot.PostMappingToDatabase.Entity.Employee;
import com.SpringBoot.PostMappingToDatabase.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee saveDetails(Employee employee){
        return employeeRepo.save(employee);
    }
}
