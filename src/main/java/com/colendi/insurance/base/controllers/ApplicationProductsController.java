package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.models.ApplicationProducts;
import com.colendi.insurance.base.services.AccountsService;
import com.colendi.insurance.base.services.ApplicationProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/applicationproducts")
public class ApplicationProductsController extends BaseController{

    @Autowired
    private final ApplicationProductsService service;

    public ApplicationProductsController(){
        service = new ApplicationProductsService();
    }

    /*
    @GetMapping()
    ResponseEntity<ApplicationProducts> get() {
        return service.getApplicationProducts();
    }

    @GetMapping("/{id}")
    ResponseEntity<ApplicationProducts> one(@PathVariable Long id) {

        return service.getApplicationProductById(id);
    }
     */

    @PostMapping()
    ResponseEntity<ApplicationProducts> newAccount(@RequestBody ApplicationProducts applicationProducts) {
        try{
            return this.successResponse(service.saveApplicationProduct(applicationProducts));
        }catch (Exception exception){
            return this.failResponse ("101","Başarısız : " + exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
