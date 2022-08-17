package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Builder;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.*;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet.CalculatePremiumRequest;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet.SaveContactRequest;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.SaveContactResponse;
import com.colendi.insurance.base.models.Customers;

import java.util.HashMap;
import java.util.Map;

public class CalculatePremiumBuilder {
    public Map<String, Object>  createRequest(CalculatePremiumRequest packages){
        CalculatePremiumRequest calculatePremiumRequest = new CalculatePremiumRequest();
        packages.setAssetIvo(new AssetIvo());
        packages.setCoverIvos(new CoverIvos());
        packages.setPolicyHeader(new PolicyHeader());
        packages.setPolicyContacts(new PolicyContacts());
        packages.setPaymentTerm(new PaymentTerm());
        packages.setProductRelatedParams(new ProductRelatedParams());

        //DB ŞEMASI KURULAMADI

        Map<String, Object> body = new HashMap<>();
        body.put("contact", packages);

        return body;
    }

    public SaveContactResponse createResponse(SaveContactResponse response){
        SaveContactResponse saveContactResponse = new SaveContactResponse();
        return saveContactResponse;
    }
}
