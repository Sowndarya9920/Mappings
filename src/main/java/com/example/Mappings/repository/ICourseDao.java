package com.example.Mappings.repository;

import com.example.Mappings.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseDao extends JpaRepository<Course,Integer> {
}
