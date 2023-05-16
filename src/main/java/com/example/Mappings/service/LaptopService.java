package com.example.Mappings.service;

import com.example.Mappings.model.Laptop;
import com.example.Mappings.repository.ILaptopDao;
import com.example.Mappings.repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopDao lapDao;

    public String saveLaptop(List<Laptop> laptop) {
        List<Laptop> lp1 = lapDao.saveAll(laptop);
        return "Laptop provided";
    }

    public List<Laptop> getLaptops() {
        return lapDao.findAll();
    }

    public String deleteLaptop(Integer id) {
        if(lapDao.findById(id).isPresent()){
            lapDao.deleteById(id);
            return "Deleted";
        }
        return "Invalid id";
    }

    public String updateLaptop(Laptop laptop, Integer id) {
        if(lapDao.findById(id).isPresent()){
            Laptop lap = lapDao.findById(id).get();
            lap.setName(laptop.getName());
            lap.setBrand(laptop.getBrand());
            lap.setPrice(laptop.getPrice());
            lapDao.save(lap);
            return "updated successfully";
        }
        return "Invalid details";
    }
}
