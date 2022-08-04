package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.exceptions.AccountNotFoundException;
import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.services.AccountsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    private final AccountsService service;

    public AccountsController(){
        service = new AccountsService();
    }

    @GetMapping()
    List<Accounts> all() {
        return service.findAll();
    }

    @PostMapping()
    Accounts newAccount(@RequestBody Accounts newAccount) {
        return service.save(newAccount);
    }

    @GetMapping("/{id}")
    Accounts one(@PathVariable Long id) {

        return service.findById(id);
               // .orElseThrow(() -> new AccountNotFoundException(id));
    }
}
