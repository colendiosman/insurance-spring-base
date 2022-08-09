package com.colendi.insurance.base.services;

import com.colendi.insurance.base.exceptions.ApplicationProductNotFoundException;
import com.colendi.insurance.base.models.ApplicationProducts;
import com.colendi.insurance.base.repositories.ApplicationProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ApplicationProductsService {
    @Autowired
    private ApplicationProductsRepository repository;

    public ApplicationProductsService(){}

    public ApplicationProducts getApplicationProductById(Long id) throws ApplicationProductNotFoundException {
        try{
            return repository.findById(id).orElseThrow();
        }catch (Exception exception){
            throw new ApplicationProductNotFoundException("ApplicationProduct not found for this id :: " + id);
        }
    }

    public List<ApplicationProducts> getApplicationProducts(){
        return repository.findAll();
    }

    public ApplicationProducts saveApplicationProduct(@RequestBody ApplicationProducts applicationProduct){
        return repository.save(applicationProduct);
    }

    public ApplicationProducts updateApplicationProduct(@RequestBody ApplicationProducts applicationProduct) throws ApplicationProductNotFoundException {
        ApplicationProducts newApplicationProduct = repository.findById(applicationProduct.getId())
                .orElseThrow(() -> new ApplicationProductNotFoundException("ApplicationProduct not found for this id :: " + applicationProduct.getId().toString()));

        newApplicationProduct.setApplicationId(applicationProduct.getApplicationId());
        newApplicationProduct.setProductId(applicationProduct.getProductId());
        final ApplicationProducts updatedApplicationProduct = repository.save(newApplicationProduct);
        return updatedApplicationProduct;
    }

    public ApplicationProducts deleteApplicationProductById(Long id) throws ApplicationProductNotFoundException{
        ApplicationProducts deleteApplicationProduct = repository.findById(id)
                .orElseThrow(() -> new ApplicationProductNotFoundException("ApplicationProduct not found for this id :: " + id.toString()));

        repository.delete(deleteApplicationProduct);
        return deleteApplicationProduct;
    }
}
