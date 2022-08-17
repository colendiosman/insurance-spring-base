package com.colendi.insurance.base.controllers;

import ch.qos.logback.core.net.server.Client;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.AnadoluSigortaIntegration;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.ConsumerContext;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.Contact;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.SaveContactResponse;
import com.colendi.insurance.base.libraries.Providers.Client.SendRequest;
import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.services.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Security;
import java.util.*;

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
            AnadoluSigortaIntegration anadoluSigortaIntegration = new AnadoluSigortaIntegration();
            SendRequest sendRequest = new SendRequest();

            Map<String, Object> body = new HashMap<>();
            ConsumerContext consumerContext = new ConsumerContext();
            Contact contact = new Contact();

            body.put("consumerContext", consumerContext);
            body.put("contact", contact);
            consumerContext.setLang("TR-TR-TR-TR");
            contact.setLegalTypeVORef("hasan");

            SaveContactResponse response = (SaveContactResponse) sendRequest.sendPostRequest("http://localhost:8099/pet/contacts", body, "header", HttpMethod.POST);

            return this.successResponse(service.save(newAccount).getBody());
        }catch (Exception exception){
            return this.failResponse ("101","Başarısız : " + exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
