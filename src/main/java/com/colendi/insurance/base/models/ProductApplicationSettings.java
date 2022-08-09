package com.colendi.insurance.base.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_partner_settings")
public class ProductApplicationSettings extends Base{
    @Id
    private Long id;
    @Column(name = "applicationProductId")
    private Integer applicationProductId;
    @Column(name = "description")
    private String description;
    @Column(name = "isSmsRequired")
    private Integer isSmsRequired;
    @Column(name = "isMailRequired")
    private Integer isMailRequired;
    @Column(name = "isOtpRequired")
    private Integer isOtpRequired;
    @Column(name = "isKycRequired")
    private Integer isKycRequired;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getApplicationProductId() {
        return applicationProductId;
    }

    public void setApplicationProductId(Integer applicationProductId) {
        this.applicationProductId = applicationProductId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsSmsRequired() {
        return isSmsRequired;
    }

    public void setIsSmsRequired(Integer isSmsRequired) {
        this.isSmsRequired = isSmsRequired;
    }

    public Integer getIsMailRequired() {
        return isMailRequired;
    }

    public void setIsMailRequired(Integer isMailRequired) {
        this.isMailRequired = isMailRequired;
    }

    public Integer getIsOtpRequired() {
        return isOtpRequired;
    }

    public void setIsOtpRequired(Integer isOtpRequired) {
        this.isOtpRequired = isOtpRequired;
    }

    public Integer getIsKycRequired() {
        return isKycRequired;
    }

    public void setIsKycRequired(Integer isKycRequired) {
        this.isKycRequired = isKycRequired;
    }
}
