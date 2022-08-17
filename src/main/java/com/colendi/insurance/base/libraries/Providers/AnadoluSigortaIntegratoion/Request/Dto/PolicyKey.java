package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PolicyKey {
    private String revisionNumber;
    private String renewalNumber;
    private Date proposalValidDate;
    private String proposalNumber;
}