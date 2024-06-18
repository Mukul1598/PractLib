package com.acciojob.Practice_Library_Management_System.Controllers;

import com.acciojob.Practice_Library_Management_System.Entities.Student;
import com.acciojob.Practice_Library_Management_System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

//    @Autowired
//    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
//          OR
//      String result = studentService.addStudent(student);
//      return result;
    }
}
