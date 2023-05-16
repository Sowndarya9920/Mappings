package com.example.Mappings.controller;

import com.example.Mappings.model.Course;
import com.example.Mappings.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping(value = "/saveCourses")
    public String saveCourses(@RequestBody Course course){
        String response = courseService.saveCourse(course);
        return response;
    }

}
