package com.colendi.insurance.base.services;

import com.colendi.insurance.base.models.Providers;

import java.util.Collections;
import java.util.List;

public class ProvidersService {

    public Providers create(Providers providers) {
        return new Providers();
    }

    public Providers detail(Long id) {
        return new Providers();
    }

    public List<Providers> list() {
        return Collections.emptyList();
    }

    public Providers update(Providers provider){
        return new Providers();
    }

    public Boolean changeStatus(int id){
        return true;
    }

    public Boolean checkProvider(){
        return true;
    }
}
