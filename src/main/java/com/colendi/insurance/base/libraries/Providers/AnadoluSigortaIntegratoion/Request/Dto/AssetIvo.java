package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AssetIvo {
    private String petTypeVORef;
    private String petGenderVORef;
    private String petName;
    private String breed;
    private String chipNo;
    private String colour;
    private Date dateOfBirth;
}
