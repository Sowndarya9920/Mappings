package com.example.Mappings.service;

import com.example.Mappings.model.Course;
import com.example.Mappings.repository.ICourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseDao courseDao;
    public String saveCourse(Course course) {
        Course c1 = courseDao.save(course);
        return "Courses saved";
    }
}
