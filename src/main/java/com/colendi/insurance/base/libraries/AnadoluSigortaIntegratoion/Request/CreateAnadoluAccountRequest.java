package com.colendi.insurance.base.libraries.AnadoluSigortaIntegratoion.Request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateAnadoluAccountRequest {

    private String tckn;
    private Date birthdate;

    public String toXml(){
        return "xml gönderikecek";
    }
}
