package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.InsuranceAttributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceAttributesRepository extends JpaRepository<InsuranceAttributes, Long> {
}
