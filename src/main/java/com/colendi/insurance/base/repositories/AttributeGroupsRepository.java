package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.AttributeGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeGroupsRepository extends JpaRepository<AttributeGroups, Long> {

}
