package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Contact {
    private Date contactBirthDate;
    private String idTypeVORef; //TCKN
    private Long idValue;
    private String legalTypeVORef; //OTR
    private EmailStructure emailStructureList;
    private TelephoneStructure telephoneStructureList;

}