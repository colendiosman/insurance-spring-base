package com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.Builder;

import com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.Request.CreateAnadoluAccountRequest;
import com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.Response.CreateaAnadoluAccountResponse;
import com.colendi.insurance.base.models.Accounts;

public class AnadoluAccountBuilder {
    public String createRequestBuilder(Accounts accounts){
        CreateAnadoluAccountRequest createAnadoluAccountRequest = new CreateAnadoluAccountRequest();
        createAnadoluAccountRequest.setTckn(accounts.getName());
        createAnadoluAccountRequest.setBirthdate(accounts.getCreatedAt());
        return createAnadoluAccountRequest.toXml();
    }

    public CreateaAnadoluAccountResponse createResposeBuilder(String xmlBody){
        CreateaAnadoluAccountResponse anadoluAccountResponse = new CreateaAnadoluAccountResponse();
        anadoluAccountResponse.setCustomerId(123L);
        return anadoluAccountResponse;
    }
}
