package com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion;

import com.colendi.insurance.base.models.Accounts;

public class AnadoluSigortaIntegration {
    public Accounts CreateAccount(){
        Accounts accounts = new Accounts();
        accounts.setId(123L);
        accounts.setName("name");
        accounts.setDescription("desc");

        return accounts;
    }
}
