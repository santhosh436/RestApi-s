package com.SpringBoot.GetMappingFromDatabase.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "Name")
    private String studentName;
    @Column(name = "Year")
    private String studentYear;
    @Column(name = "Age")
    private int studentAge;
    @Column(name = "Branch")
    private String StudentBranch;

    public Student(int id, String studentName, String studentYear, int studentAge, String studentBranch) {
        this.id = id;
        this.studentName = studentName;
        this.studentYear = studentYear;
        this.studentAge = studentAge;
        StudentBranch = studentBranch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentBranch() {
        return StudentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        StudentBranch = studentBranch;
    }

    public Student() {
        super();
    }
}
