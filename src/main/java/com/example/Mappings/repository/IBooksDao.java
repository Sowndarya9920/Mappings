package com.example.Mappings.repository;

import com.example.Mappings.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBooksDao extends JpaRepository<Books,Integer> {
}
