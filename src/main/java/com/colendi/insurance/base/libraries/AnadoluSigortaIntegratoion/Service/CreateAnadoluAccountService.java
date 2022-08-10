package com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.Service;

import com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.Builder.AnadoluAccountBuilder;
import com.colendi.insurance.base.libraries.HttpRequester.HttpRequester;
import com.colendi.insurance.base.models.Accounts;

public class CreateAnadoluAccountService {
    public void createAccount(Accounts accounts){
        AnadoluAccountBuilder anadoluAccountBuilder = new AnadoluAccountBuilder();
        String requestBody = anadoluAccountBuilder.createRequestBuilder(accounts);
        HttpRequester httpRequester = new HttpRequester();
        String respose = httpRequester.SendXmlRequest("url", requestBody, "header");

    }
}
