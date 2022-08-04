package com.colendi.insurance.base.controllers;

import com.colendi.insurance.base.models.Providers;
import com.colendi.insurance.base.services.ProvidersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProvidersController extends BaseController{

    @GetMapping("")
    List<Providers> all() {
        return (new ProvidersService()).list();
    }

    @PostMapping("/create")
    Providers createProvider(@RequestBody Providers provider) {
        return (new ProvidersService()).create(provider);
    }

    @GetMapping("/{id}")
    Providers one(@PathVariable Long id) {
        return (new ProvidersService()).detail(id);
    }

    @PutMapping("/{id}")
    Boolean deleteEmployee(@PathVariable int id) {
        return (new ProvidersService()).changeStatus(id);
    }
}
