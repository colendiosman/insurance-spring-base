package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Builder;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.Contact;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.EmailStructure;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.TelephoneStructure;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet.SaveContactRequest;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.SaveContactResponse;
import com.colendi.insurance.base.models.Customers;

import java.util.HashMap;
import java.util.Map;

public class SaveContactBuilder {
    public Map<String, Object> createRequest(Customers customers){
        SaveContactRequest saveContactRequest = new SaveContactRequest();
        saveContactRequest.setContact(new Contact());
        saveContactRequest.getContact().setEmailStructureList(new EmailStructure());
        saveContactRequest.getContact().setTelephoneStructureList(new TelephoneStructure());
        saveContactRequest.getContact().setContactBirthDate(customers.getBirthDate());
        saveContactRequest.getContact().setIdTypeVORef(customers.getTckn());
        saveContactRequest.getContact().setLegalTypeVORef(customers.getDistrict()); //?
        saveContactRequest.getContact().setIdValue(customers.getId());
        saveContactRequest.getContact().getEmailStructureList().setEmailAddress(customers.getEmail());
        saveContactRequest.getContact().getEmailStructureList().setEmailTypeVORef(customers.getEmail()); //?
        saveContactRequest.getContact().getTelephoneStructureList().setCountryCodeVORef(customers.getGsm());
        saveContactRequest.getContact().getTelephoneStructureList().setTelephoneNumber(customers.getGsm());
        saveContactRequest.getContact().getTelephoneStructureList().setTelephonePrefixCodeVORef(customers.getGsm()); // ?
        saveContactRequest.getContact().getTelephoneStructureList().setTelephoneTypeVORef(customers.getGsm()); // ?

        saveContactRequest.setContact(saveContactRequest.getContact());
        Map<String, Object> body = new HashMap<>();
        body.put("contact", saveContactRequest.getContact());

        return body;
    }

    public SaveContactResponse createResponse(SaveContactResponse response){
        SaveContactResponse saveContactResponse = new SaveContactResponse();
        return saveContactResponse;
    }
}
