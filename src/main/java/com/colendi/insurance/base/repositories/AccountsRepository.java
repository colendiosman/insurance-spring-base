package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.Accounts;
import java.util.ArrayList;
import java.util.List;

public class AccountsRepository {
    public Accounts Find(int id){
        Accounts account = new Accounts();

        return account;
    }

    public List<Accounts> FindAll(int id){
        List<Accounts> accountList = new ArrayList<Accounts>();

        return accountList;
    }

    public void Create(Accounts param){
        Accounts account = new Accounts();

        account.setId(param.getId());
    }
}
