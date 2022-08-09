package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.services.AccountsService;
import com.colendi.insurance.base.services.AttributeGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attributeGroups")
public class AttributeGroupsController extends BaseController {
    @Autowired
    private final AttributeGroupsController service;

    /*public AttributeGroupsController(){
        service = new AttributeGroupsService();
    }
     */
}
