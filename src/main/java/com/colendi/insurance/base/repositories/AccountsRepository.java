package com.colendi.insurance.base.repositories;

import com.colendi.insurance.base.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;
import java.util.List;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    //List<Accounts> findByPublished(boolean published);
    //List<Accounts> findByTitleContaining(String title);
}