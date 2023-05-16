package com.example.Mappings.repository;

import com.example.Mappings.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopDao extends JpaRepository<Laptop,Integer> {
}
