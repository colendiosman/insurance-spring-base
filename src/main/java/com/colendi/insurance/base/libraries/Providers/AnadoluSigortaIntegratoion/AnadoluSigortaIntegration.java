package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Builder.CalculatePremiumBuilder;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Builder.SaveContactBuilder;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.ConsumerContext;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.Contact;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet.CalculatePremiumRequest;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet.SaveContactRequest;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.CalculatePremiumResponse;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.CreatePolicyFromProposalResponse;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.CreateProposalListResponse;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.SaveContactResponse;
import com.colendi.insurance.base.libraries.Providers.Client.SendRequest;
import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.models.Customers;
import org.springframework.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

public class AnadoluSigortaIntegration {
    public SaveContactResponse createUsers(Customers customer){
        String url = "http://localhost:8099/pet/users";
        String header = "";
        SaveContactBuilder saveContactBuilder= new SaveContactBuilder();
        SendRequest sendRequest = new SendRequest();

        Map<String, Object> body  = saveContactBuilder.createRequest(customer);
        SaveContactResponse response = (SaveContactResponse) sendRequest.sendPostRequest(url, body, "header", HttpMethod.POST);

        return saveContactBuilder.createResponse(response);
    }

    public CalculatePremiumResponse CalculatePremium(CalculatePremiumRequest calculatePremiumRequest){
        String url = "http://localhost:8099/pet/users";
        String header = "";
        CalculatePremiumBuilder calculatePremiumBuilder = new CalculatePremiumBuilder();
        SendRequest sendRequest = new SendRequest();

        Map<String, Object> body  = calculatePremiumBuilder.createRequest(calculatePremiumRequest);
        CalculatePremiumResponse response = (CalculatePremiumResponse) sendRequest.sendPostRequest(url, body, "header", HttpMethod.POST);

        return response;
    }

    public CreateProposalListResponse CreateProposalList(){
        String url = "http://localhost:8099/pet/users";
        String header = "";

        CreateProposalListResponse response = new CreateProposalListResponse();
        return response;
    }

    public CreatePolicyFromProposalResponse CreatePolicyFromProposal(){
        CreatePolicyFromProposalResponse response = new CreatePolicyFromProposalResponse();
        return response;
    }
}