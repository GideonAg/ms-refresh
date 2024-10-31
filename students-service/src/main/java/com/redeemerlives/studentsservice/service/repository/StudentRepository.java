package com.redeemerlives.studentsservice.service.repository;

import com.redeemerlives.studentsservice.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students, Integer> {
}
