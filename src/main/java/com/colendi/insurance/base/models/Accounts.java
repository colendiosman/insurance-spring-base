package com.colendi.insurance.base.models;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "accounts")
public class Accounts extends Base {
    @Id
    private Long id;
    @Column(name = "name")
    @NotBlank(message = "Name should not be blank")
    @Size(min = 3,message = "Name should be at least 3 chars")
    private String name;

    @Column(name = "description")
    @NotBlank(message = "Name should not be blank")
    @Size(min = 3,message = "Name should be at least 3 chars")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
