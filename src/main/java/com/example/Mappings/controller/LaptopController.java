package com.example.Mappings.controller;

import com.example.Mappings.model.Laptop;
import com.example.Mappings.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService lapService;

    @PostMapping(value = "/saveLaptop")
    public ResponseEntity<String> saveLaptop(@RequestBody List<Laptop> laptop){
        String response = lapService.saveLaptop(laptop);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAllLaptops")
    public List<Laptop> getLaptop(){
        return lapService.getLaptops();
    }
    @DeleteMapping(value = "/deleteLaptop")
    public String deleteLaptop(@RequestParam Integer id){
        return lapService.deleteLaptop(id);
    }
    @PutMapping(value = "/updateLaptop")
    public String updateLaptop(@RequestBody Laptop laptop , @RequestParam Integer id){
        return lapService.updateLaptop(laptop,id);
    }
}
