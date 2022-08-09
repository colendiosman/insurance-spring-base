package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.ProductApplicationSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductApplicationSettingsRepository extends JpaRepository<ProductApplicationSettings, Long> {}
