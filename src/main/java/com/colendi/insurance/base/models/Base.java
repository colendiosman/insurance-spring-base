package com.colendi.insurance.base.models;
import javax.persistence.Column;
import java.util.Date;

public class Base {
    @Column(name = "createdAd")
    private Date createdAt;
    @Column(name = "updatedAd")
    private Date updatedAt;
    @Column(name = "deletedAd")
    private Date deletedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
