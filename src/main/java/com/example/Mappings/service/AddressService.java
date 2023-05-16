package com.example.Mappings.service;

import com.example.Mappings.model.Address;
import com.example.Mappings.repository.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressDao addDao;
    public String addAddress(List<Address> address) {
        List<Address> add = addDao.saveAll(address);
        return "Address added successfully";
    }

    public List<Address> getAddress() {
        return addDao.findAll();
    }

    public String deleteAddress(Integer id) {
        if(addDao.findById(id).isPresent()){
           addDao.deleteById(id);
           return "Address deleted";
        }
        return "Address not found . Enter the valid id";
    }

    public String updateAddress(Address address, Integer id) {
        if(addDao.findById(id).isPresent()){
            Address add = addDao.findById(id).get();
            add.setCountry(address.getCountry());
            add.setDistrict(address.getDistrict());
            add.setState(address.getState());
            add.setLandmark(address.getLandmark());
            add.setZipcode(address.getZipcode());
            addDao.save(add);
            return "updated successfully";

        }
        return "Unable to update the address. Check the valid id to update the details";
    }
}
