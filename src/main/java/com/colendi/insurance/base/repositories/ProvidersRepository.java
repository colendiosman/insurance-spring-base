package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.Providers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvidersRepository extends JpaRepository<Providers, Long> {}
