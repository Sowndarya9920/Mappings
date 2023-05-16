package com.example.Mappings.repository;

import com.example.Mappings.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends JpaRepository<Address,Integer> {
}
