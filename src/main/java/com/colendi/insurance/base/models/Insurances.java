package com.colendi.insurance.base.models;

import com.colendi.insurance.base.enums.status;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "insurances")
public class Insurances extends Base{
    @Id
    private Long id;

    @Column(name = "status")
    private status status;

    @Column(name = "price")
    private DecimalFormat price;

    @Column(name = "policyId")
    private int policyId;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customers customers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.colendi.insurance.base.enums.status getStatus() {
        return status;
    }

    public void setStatus(com.colendi.insurance.base.enums.status status) {
        this.status = status;
    }

    public DecimalFormat getPrice() {
        return price;
    }

    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
}
