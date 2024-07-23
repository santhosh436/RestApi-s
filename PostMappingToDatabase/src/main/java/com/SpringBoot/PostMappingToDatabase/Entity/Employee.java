package com.SpringBoot.PostMappingToDatabase.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long id;
    @Column(name = "Name")
    private String employeeName;
    @Column(name = "Address")
    private String employeeAddress;
    @Column(name = "Salary")
    private int employeeSalary;
}
