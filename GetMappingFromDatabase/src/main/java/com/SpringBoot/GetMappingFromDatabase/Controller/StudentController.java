package com.SpringBoot.GetMappingFromDatabase.Controller;

import com.SpringBoot.GetMappingFromDatabase.Entity.Student;
import com.SpringBoot.GetMappingFromDatabase.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/add")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudentDetails(student);
    }
    @GetMapping(value = "/get")
    public List<Student> getDetails(){
        return studentService.getAllDetails();
    }

    //using @PathVariable
    @GetMapping(value = "/get/{id}")
    public Student getDetailsById(@PathVariable int id){
        return studentService.getStudentDetailById(id);
    }

    //using @RequestParam
    @GetMapping(value = "/get/by")
    public Student getDetailsByIdParam(@RequestParam int id){

        return studentService.getStudentDetailById(id);
    }

    @PutMapping("/put")
    public Student UpdateDetailsById(@RequestBody Student student){
        return studentService.UpadateDetails(student);
    }

    @DeleteMapping("/delete")
    public String deleteDetails(int id){
        return studentService.deleteDetail(id);
    }


}
