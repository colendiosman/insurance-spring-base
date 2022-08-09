package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    //List<Accounts> findByPublished(boolean published);
    //List<Accounts> findByTitleContaining(String title);
}