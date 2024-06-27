package com.example.labraporlama.controller;

import com.example.labraporlama.model.Laborant;
import com.example.labraporlama.services.LaborantServisi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/laborantlar")
public class LaborantController {
    @Autowired
    private LaborantServisi laborantService;

    // Yeni bir laborant oluşturur
    @PostMapping
    public Laborant olusturLaborant(@RequestBody Laborant laborant) {
        return laborantService.kaydetLaborant(laborant);
    }

    // Diğer CRUD yöntemleri gerektiğinde eklenebilir
}
