package com.colendi.insurance.base.services;

import com.colendi.insurance.base.exceptions.AccountNotFoundException;
import com.colendi.insurance.base.models.ApplicationAgreements;
import com.colendi.insurance.base.repositories.ApplicationAgreementsRepository;
import com.colendi.insurance.base.repositories.ApplicationProductPermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationAgreementsService {

    @Autowired
    private ApplicationAgreementsRepository repository;

    public ApplicationAgreementsService(){}

    public ApplicationAgreements getApplicationAgreementById(Long id){
        return null;
    }

    public List<ApplicationAgreements> getApplicationAgreements(){
        return null;
    }

    public ApplicationAgreements saveApplicationAgreement(ApplicationAgreements applicationAgreements){
        return null;
    }

    public ApplicationAgreements updateApplicationAgreement(ApplicationAgreements applicationAgreements){
        return null;
    }

    public ApplicationAgreements deleteApplicationAgreementById(){
        return null;
    }


}
