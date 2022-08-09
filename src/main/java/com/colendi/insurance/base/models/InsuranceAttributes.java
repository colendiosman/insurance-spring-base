package com.colendi.insurance.base.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "insurance_attributes")
public class InsuranceAttributes extends Base{
    @Id
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "insurancesId")
    private Insurances insurances;

    @ManyToMany
    private Set<AttributeOptions> attributeOptions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Insurances getInsurances() {
        return insurances;
    }

    public void setInsurances(Insurances insurances) {
        this.insurances = insurances;
    }

    public Set<AttributeOptions> getAttributeOptions() {
        return attributeOptions;
    }

    public void setAttributeOptions(Set<AttributeOptions> attributeOptions) {
        this.attributeOptions = attributeOptions;
    }
}
