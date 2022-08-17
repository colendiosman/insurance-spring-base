package com.colendi.insurance.base.services;

import com.colendi.insurance.base.helpers.DateFormats;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.AnadoluSigortaIntegration;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.SaveContactResponse;
import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.models.Customers;
import com.colendi.insurance.base.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {
    @Autowired
    CustomersRepository repository;
    public CustomersService(){
    }

    public ResponseEntity<Customers> save(Customers param){
        try {
            Customers createdCustomer = new Customers();
            createdCustomer.setId(param.getId());
            createdCustomer.setFirstName(param.getFirstName());
            createdCustomer.setLastName(param.getLastName());
            createdCustomer.setEmail(param.getEmail());
            createdCustomer.setTckn(param.getTckn());
            createdCustomer.setCity(param.getCity());
            createdCustomer.setDistrict(param.getDistrict());

            createdCustomer.setCreatedAt(DateFormats.GetDateNow());
            createdCustomer.setUpdatedAt(DateFormats.GetDateNow());
            createdCustomer.setDeletedAt(DateFormats.GetDateNow());

            repository.save(createdCustomer);
            return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);


        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
