package com.example.labraporlama.controller;

import com.example.labraporlama.model.Rapor;
import com.example.labraporlama.services.RaporServisi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/raporlar")
public class RaporController {
    @Autowired
    private RaporServisi raporServisi;

    // Yeni bir rapor oluşturur
    @PostMapping
    public Rapor olusturRapor(@RequestBody Rapor rapor) {
        return raporServisi.kaydetRapor(rapor);
    }

    // Mevcut bir raporu günceller
    @PutMapping("/{id}")
    public Rapor guncelleRapor(@PathVariable Long id, @RequestBody Rapor rapor) {
        return raporServisi.guncelleRapor(id, rapor);
    }

    // Mevcut bir raporu siler
    @DeleteMapping("/{id}")
    public void silRapor(@PathVariable Long id) {
        raporServisi.silRapor(id);
    }

    // Tüm raporları getirir
    @GetMapping
    public List<Rapor> tumRaporlariGetir() {
        return raporServisi.tumRaporlariGetir();
    }

    // Arama kriterlerine göre raporları getirir
    @GetMapping("/arama")
    public List<Rapor> aramaRaporlari(@RequestParam String query) {
        return raporServisi.aramaRaporlari(query);
    }

    // Raporları tarihine göre sıralar
    @GetMapping("/sirala")
    public List<Rapor> tariheGoreSirala() {
        return raporServisi.tariheGoreSirala();
    }
}
