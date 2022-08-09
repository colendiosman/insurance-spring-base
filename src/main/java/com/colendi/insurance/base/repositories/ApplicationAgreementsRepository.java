package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.ApplicationAgreements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationAgreementsRepository extends JpaRepository<ApplicationAgreements, Long> {}
