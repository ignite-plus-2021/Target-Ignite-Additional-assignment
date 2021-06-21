package com.example.attempt.employee;

class EmpNotFoundException extends RuntimeException {

    EmpNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}