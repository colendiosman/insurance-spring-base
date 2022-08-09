package com.colendi.insurance.base.services;

import com.colendi.insurance.base.models.ApplicationProductPermissions;
import com.colendi.insurance.base.repositories.ApplicationProductPermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationProductPermissionsService {

    @Autowired
    private ApplicationProductPermissionsRepository repository;

    public ApplicationProductPermissionsService(){}

    public ApplicationProductPermissions getApplicationProductPermissionById(Long id){
        return null;
    }

    public List<ApplicationProductPermissions> getApplicationProductPermissions(){
        return null;
    }

    public ApplicationProductPermissions saveApplicationProductPermissions(ApplicationProductPermissions applicationProductPermissions){
        return null;
    }

    public ApplicationProductPermissions updateApplicationProductPermission(ApplicationProductPermissions applicationProductPermissions){
        return null;
    }

    public ApplicationProductPermissions deleteApplicationProductPermissionById(){
        return null;
    }

}
