package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.exceptions.AccountNotFoundException;
import com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.AnadoluSigortaIntegration;
import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.services.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountsController extends BaseController {

    @Autowired
    private final AccountsService service;

    public AccountsController(){
        service = new AccountsService();
    }

    @GetMapping()
    List<Accounts> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    Optional<Accounts> one(@PathVariable Long id) {

        return service.findById(id);
    }

    @PostMapping()
    ResponseEntity<Accounts> newAccount(@RequestBody @Valid Accounts newAccount) {

        try{
            //Servisten dönecek olan acccount bilgisi gibi bir modelin descriptionu değiştirildi.
            AnadoluSigortaIntegration anadoluSigortaIntegration = new AnadoluSigortaIntegration();
            Accounts accounts = anadoluSigortaIntegration.CreateAccount();
            newAccount.setDescription(accounts.getDescription());
            //
            return this.successResponse(service.save(newAccount).getBody());
        }catch (Exception exception){
            return this.failResponse ("101","Başarısız : " + exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
