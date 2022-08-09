package com.colendi.insurance.base.models;

import javax.persistence.*;

@Entity
@Table(name = "attribute_variants")
public class AttributeVariants extends Base {
    @Id
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "attributeOptionId")
    private AttributeOptions attributeOptions;

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

    public AttributeOptions getAttributeOptions() {
        return attributeOptions;
    }

    public void setAttributeOptions(AttributeOptions attributeOptions) {
        this.attributeOptions = attributeOptions;
    }
}
