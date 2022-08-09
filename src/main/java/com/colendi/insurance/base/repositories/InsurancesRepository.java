package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.Insurances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurancesRepository extends JpaRepository<Insurances, Long> {
}
