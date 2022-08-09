package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.ApplicationProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationProductsRepository extends JpaRepository<ApplicationProducts, Long> {}
