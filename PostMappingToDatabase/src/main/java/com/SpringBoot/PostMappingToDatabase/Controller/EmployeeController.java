package com.SpringBoot.PostMappingToDatabase.Controller;

import com.SpringBoot.PostMappingToDatabase.Entity.Employee;
import com.SpringBoot.PostMappingToDatabase.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.saveDetails(employee);
    }

    @GetMapping
    public String showCommand(){
        return "Succussfully inserted";
    }
}
