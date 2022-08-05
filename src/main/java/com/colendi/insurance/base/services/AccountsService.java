package com.colendi.insurance.base.services;

import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.repositories.AccountsRepository;
import org.hibernate.tool.schema.spi.SourceDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Accounts save(Accounts param){
        Accounts account = new Accounts();

        account.setId(param.getId()); //boş kalmasın deyi
        return account;
    }
}
