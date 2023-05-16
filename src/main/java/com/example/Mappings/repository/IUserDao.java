package com.example.Mappings.repository;

import com.example.Mappings.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<Student,Integer> {
}
