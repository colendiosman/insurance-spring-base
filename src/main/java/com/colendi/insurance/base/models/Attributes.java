package com.colendi.insurance.base.models;

import javax.persistence.*;

@Entity
@Table(name = "attributes")
public class Attributes extends Base {
    @Id
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "parameterKey")
    private String parameterKey;

    @ManyToOne
    @JoinColumn(name = "applicationProductId")
    private AttributeGroups attributeGroups;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getParameterKey() {
        return parameterKey;
    }

    public AttributeGroups getAttributeGroups() {
        return attributeGroups;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    public void setAttributeGroups(AttributeGroups attributeGroups) {
        this.attributeGroups = attributeGroups;
    }
}
