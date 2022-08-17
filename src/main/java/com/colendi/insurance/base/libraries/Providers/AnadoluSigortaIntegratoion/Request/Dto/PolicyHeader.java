package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PolicyHeader {
    private String agencyCode;
    private String policyCurrencyVORef;
    private Date policyStartDate;
    private String policyTypeVORef;
    private String productTypeVORef;
    private String salesChannelVORef;
    private String subAgencyCode;
}