package com.SpringBoot.GetMappingFromDatabase.Service;

import com.SpringBoot.GetMappingFromDatabase.Entity.Student;
import com.SpringBoot.GetMappingFromDatabase.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudentDetails(Student student){

        return studentRepo.save(student);
    }

    public List<Student> getAllDetails() {
        return studentRepo.findAll();
    }

    public Student getStudentDetailById(int id){
        Student student = studentRepo.findById(id).orElse(null);
        return student;
    }

    public Student UpadateDetails(Student student){
        Student upadateStudent = studentRepo.findById(student.getId()).orElse(null);
        if(upadateStudent != null){
            upadateStudent.setStudentAge(student.getStudentAge());
            upadateStudent.setStudentBranch(student.getStudentBranch());
            upadateStudent.setStudentName(student.getStudentName());
            upadateStudent.setStudentYear(student.getStudentYear());
            studentRepo.save(upadateStudent);
            return upadateStudent;
        }
        return null;
    }

    public String deleteDetail(int id){
        studentRepo.deleteById(id);
        return "Delete"+id;
    }
}
