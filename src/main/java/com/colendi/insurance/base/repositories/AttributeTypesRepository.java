package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.AttributeTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeTypesRepository extends JpaRepository<AttributeTypes, Long> {
}
