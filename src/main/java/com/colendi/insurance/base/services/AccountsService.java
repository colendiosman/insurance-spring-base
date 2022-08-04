package com.colendi.insurance.base.services;

import com.colendi.insurance.base.models.Accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountsService {
    public Accounts findById(Long id){
        Accounts account = new Accounts();

        return account;
    }

    public List<Accounts> findAll(){
        List<Accounts> accountList = new ArrayList<Accounts>();

        return accountList;
    }

    public Accounts save(Accounts param){
        Accounts account = new Accounts();

        account.setId(param.getId()); //boş kalmasın deyi
        return account;
    }
}
