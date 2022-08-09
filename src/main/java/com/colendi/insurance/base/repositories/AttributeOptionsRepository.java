package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.AttributeOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeOptionsRepository extends JpaRepository<AttributeOptions, Long> {
}
