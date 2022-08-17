package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentInfo {
    private String cardNumber;
    private String cardType;
    private String creditCardHolderName;
    private String cvcCode;
    private String expMonth;
    private String expYear;
}