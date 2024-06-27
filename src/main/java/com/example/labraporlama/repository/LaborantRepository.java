package com.example.labraporlama.repository;

import com.example.labraporlama.model.Laborant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaborantRepository extends JpaRepository<Laborant, Long> {
}
