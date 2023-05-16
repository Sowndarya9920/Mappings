package com.example.Mappings.controller;

import com.example.Mappings.exceptions.NotValid;
import com.example.Mappings.model.Student;
import com.example.Mappings.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping(value = "/acceptStudent")
    public ResponseEntity<String> acceptStudents(@RequestBody List<Student> students){
        String student = studentService.acceptStudents(students);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
    @GetMapping(value = "/getAllStudents")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping(value = "/removeStudent")
    public String removeStudent(@RequestParam Integer id) throws NotValid {
        return studentService.removeStudent(id);
    }
    @PutMapping(value="/updateStudent")
    public String updateStudent(@RequestBody Student student , @RequestParam Integer id) throws NotValid{
        return studentService.updateStudent(student,id);
    }
}
