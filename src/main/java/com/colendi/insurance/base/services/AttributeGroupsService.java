package com.colendi.insurance.base.services;

import com.colendi.insurance.base.models.Accounts;
import com.colendi.insurance.base.models.AttributeGroups;
import com.colendi.insurance.base.repositories.AttributeGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttributeGroupsService {
    @Autowired
    AttributeGroupsRepository repository;

    public AttributeGroupsService() {
    }

    public Optional<AttributeGroups> findById(Long id){
        Optional<AttributeGroups> attributeGroupsData = repository.findById(id);
        return attributeGroupsData;
    }

    public List<AttributeGroups> findAll(){
        return repository.findAll();
    }
}
