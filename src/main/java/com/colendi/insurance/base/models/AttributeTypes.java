package com.colendi.insurance.base.models;

import javax.persistence.*;

@Entity
@Table(name = "attribute_types")
public class AttributeTypes extends Base{
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="attributeOptionId")
    private AttributeOptions attributeOptions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AttributeOptions getAttributeOptions() {
        return attributeOptions;
    }

    public void setAttributeOptions(AttributeOptions attributeOptions) {
        this.attributeOptions = attributeOptions;
    }
}
