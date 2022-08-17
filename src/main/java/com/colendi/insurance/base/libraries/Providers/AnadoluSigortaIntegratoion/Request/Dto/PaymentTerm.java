package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentTerm {
    private String collectionMethodVORef;
    private String paymentsTermsVORef;
    private String numOfInstallment;
}
