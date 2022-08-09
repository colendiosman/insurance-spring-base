package com.colendi.insurance.base.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application_agreements")
public class ApplicationAgreements extends Base {
    @Id
    private Long id;
    @Column(name = "application_product_id")
    private Integer applicationProductId;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
