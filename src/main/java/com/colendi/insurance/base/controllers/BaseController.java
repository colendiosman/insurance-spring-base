package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.AnadoluSigortaIntegration;
import com.colendi.insurance.base.models.Accounts;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

public class BaseController<T> {

    public ResponseEntity failResponse(String errorCode, String errorMessage, HttpStatus status){

        ResponseEntity entity = new ResponseEntity(null,status);
        return entity;
    }

    public ResponseEntity<T> successResponse(T data){
        ResponseEntity entity = new ResponseEntity<T>(data, HttpStatus.CREATED);
        return entity;
    }

}
