package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {}
