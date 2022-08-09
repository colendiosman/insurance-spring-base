package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.services.AccountsService;
import com.colendi.insurance.base.services.ApplicationProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application-products")
public class ApplicationProductsController extends BaseController{

    @Autowired
    private final ApplicationProductsService service;

    public ApplicationProductsController(){
        service = new ApplicationProductsService();
    }
}
