package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.AttributeVariants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeVariantsRepository extends JpaRepository<AttributeVariants, Long> {
}
