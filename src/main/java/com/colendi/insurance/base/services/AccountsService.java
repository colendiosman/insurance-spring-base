package com.colendi.insurance.base.services;

import com.colendi.insurance.base.helpers.DateFormats;
import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.repositories.AccountsRepository;
import org.hibernate.tool.schema.spi.SourceDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.time.LocalTime;
import java.util.*;

@Service
public class AccountsService {
    @Autowired
    AccountsRepository repository;
    public AccountsService(){
    }

    public Optional<Accounts> findById(Long id){
        Optional<Accounts> accountsData = repository.findById(id);
        return accountsData;
    }

    public List<Accounts> findAll(){
        return repository.findAll();
    }

    public ResponseEntity<Accounts> save(Accounts param){
        try {
            DateFormats dateFormats = new DateFormats();
            Date now = dateFormats.GetDateNow();

            Accounts createdAccounts = new Accounts();
            createdAccounts.setId(param.getId());
            createdAccounts.setName(param.getName());
            createdAccounts.setCreatedAt(now);
            createdAccounts.setUpdatedAt(now);
            createdAccounts.setDeletedAt(now);

            repository.save(createdAccounts);
            return new ResponseEntity<>(createdAccounts, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
