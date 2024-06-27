package com.example.labraporlama.services;

import com.example.labraporlama.model.Laborant;
import com.example.labraporlama.repository.LaborantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaborantServisi {
    @Autowired
    private LaborantRepository laborantRepository;

    // Yeni bir laborant kaydeder
    public Laborant kaydetLaborant(Laborant laborant) {
        return laborantRepository.save(laborant);
    }

    // Diğer CRUD yöntemleri gerektiğinde eklenebilir
}
