package com.colendi.insurance.base.exceptions;

public class AccountNotFoundException extends RuntimeException {
    AccountNotFoundException(Long id) {
        super("Could not find account " + id);
    }
}
