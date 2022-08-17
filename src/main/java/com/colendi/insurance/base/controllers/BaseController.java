package com.colendi.insurance.base.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
