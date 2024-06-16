package com.acciojob.Practice_Library_Management_System.Services;

import com.acciojob.Practice_Library_Management_System.Entities.Student;
import com.acciojob.Practice_Library_Management_System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student has been saved to the database";
    }
}
