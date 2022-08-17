package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelephoneStructure {
    private String countryCodeVORef;
    private String telephoneNumber;
    private String telephonePrefixCodeVORef;
    private String telephoneTypeVORef;
}