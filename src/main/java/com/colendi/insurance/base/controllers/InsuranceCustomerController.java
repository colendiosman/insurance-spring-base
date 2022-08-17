package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.AnadoluSigortaIntegration;
import com.colendi.insurance.base.models.Customers;
import com.colendi.insurance.base.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/insurance")
public class InsuranceCustomerController extends BaseController {
    @Autowired
    private final CustomersService service;

    public InsuranceCustomerController(){
        service = new CustomersService();
    }

    @PostMapping("/users")
    ResponseEntity<Customers> newCustomer( @Valid @RequestBody Customers newCustomer) {
        boolean isAnadoluSigorta = true;
        ResponseEntity<Customers> customersResponseEntity;
        try{
            if(isAnadoluSigorta){
                AnadoluSigortaIntegration anadoluSigortaIntegration = new AnadoluSigortaIntegration();
                customersResponseEntity = this.successResponse(service.save(newCustomer).getBody());
                anadoluSigortaIntegration.createUsers(newCustomer);
                return customersResponseEntity;
            }
        }catch (Exception exception){
            return this.failResponse ("101","Başarısız : " + exception.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
