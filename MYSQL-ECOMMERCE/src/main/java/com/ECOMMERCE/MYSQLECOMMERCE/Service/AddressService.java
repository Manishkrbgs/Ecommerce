package com.ECOMMERCE.MYSQLECOMMERCE.Service;

import com.ECOMMERCE.MYSQLECOMMERCE.Model.Address;
import com.ECOMMERCE.MYSQLECOMMERCE.Repository.IaddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IaddRepo iaddRepo;
    public void addaddress(Address address) {
        iaddRepo.save(address);
    }


}
