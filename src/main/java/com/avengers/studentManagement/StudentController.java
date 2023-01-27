package com.avengers.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    //Get information
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("admNo") int admNo){
        return studentService.getStudent(admNo);
    }

    //Adding the information
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @DeleteMapping("/delete_student/{id")
    public String deleteStudent(@PathVariable("id") int id){
        return studentService.deleteStudent(id);
    }
    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
        return studentService.updateStudent(id,age);
    }
}
