package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.ApplicationProductPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationProductPermissionsRepository extends JpaRepository<ApplicationProductPermissions, Long> { }
