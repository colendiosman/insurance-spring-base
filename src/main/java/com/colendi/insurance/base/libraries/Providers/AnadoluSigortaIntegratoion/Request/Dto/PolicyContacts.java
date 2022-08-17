package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PolicyContacts {
    private String externalContactNumber;
    private String legalTypeVORef;
    private String policyContactRoleVORef;
}