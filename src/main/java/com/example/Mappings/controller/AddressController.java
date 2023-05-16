package com.example.Mappings.controller;

import com.example.Mappings.model.Address;
import com.example.Mappings.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addService;

    @PostMapping(value="/saveAddress")
    public ResponseEntity<String> addAddress(@RequestBody List<Address> address){
        String response = addService.addAddress(address);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAllAddress")
    public List<Address> getAddress(){
        return addService.getAddress();
    }

    @DeleteMapping(value = "/deleteAddress")
    public ResponseEntity<String> deleteAddress(@RequestParam Integer id){
        String response = addService.deleteAddress(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping(value="/updateAddress")
    public ResponseEntity<String> updateAddress(@RequestBody Address address , @RequestParam Integer id){
        String response = addService.updateAddress(address,id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}
