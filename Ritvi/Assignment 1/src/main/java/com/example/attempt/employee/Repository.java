package com.example.attempt.employee;

import org.springframework.data.jpa.repository.JpaRepository;

interface Repository extends JpaRepository<Employee, Long> {

}
