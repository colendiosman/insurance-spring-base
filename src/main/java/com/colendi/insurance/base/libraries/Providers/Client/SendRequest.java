package com.colendi.insurance.base.libraries.Providers.Client;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.SaveContactResponse;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;

public class SendRequest {

    private RestTemplate restTemplate;

    public SendRequest(){
        restTemplate = new RestTemplate();
    }

    /*
    public SaveContactResponse sendPostRequest(String url, String body, String header){
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();

        headers.add("Content-Type", "application/json");
        headers.add("Authority", "www.jsonbulut.com");
        headers.add("Accept-Encoding", "gzip, deflate, br");
        headers.add("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36");
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        Object test =  restTemplate.exchange("https://www.jsonbulut.com/json/orderList.php?ref=d1becef32825e5c8b0fc1b096230400b&musterilerID=12",
                HttpMethod.GET,  requestEntity , Object.class);
        SaveContactResponse saveContactResponse = new SaveContactResponse();
        var a = new ResponseEntity<>(test,HttpStatus.OK);
        return saveContactResponse;
    }
*/

    public Object sendPostRequest(String url, Object body, String header, HttpMethod httpMethod){
        try{
            //Headers
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json");
            headers.add("Accept-Encoding", "gzip, deflate, br");
            HttpEntity<?> requestEntity = new HttpEntity<Object>(body,headers);
            //Web client olmalı
            Object request =  restTemplate.exchange(url,
                    httpMethod,  requestEntity , Object.class);
            return request;
        } catch (Exception exception){
            throw new RuntimeException();
        }
    }

    public SaveContactResponse getPostWithResponseHandling() {
        String url = "https://www.jsonbulut.com/json/orderList.php?ref=d1becef32825e5c8b0fc1b096230400b&musterilerID={id}";
        ResponseEntity<SaveContactResponse> response = this.restTemplate.getForEntity(url, SaveContactResponse.class, 12);
        if(response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            return null;
        }
    }

}
