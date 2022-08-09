package com.colendi.insurance.base.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "attribute_options")
public class AttributeOptions extends Base {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "isRequired")
    private Boolean isRequired;

    /*@ManyToOne
    @JoinColumn(name = "applicationProductId")
    private ApplicationProducts applicationProducts; */

    @ManyToMany
    private Set<Attributes> attributes;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getRequired() {
        return isRequired;
    }

    public Set<Attributes> getAttributes() {
        return attributes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequired(Boolean required) {
        isRequired = required;
    }

    public void setAttributes(Set<Attributes> attributes) {
        this.attributes = attributes;
    }
}
