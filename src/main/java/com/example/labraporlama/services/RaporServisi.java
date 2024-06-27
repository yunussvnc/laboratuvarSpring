package com.example.labraporlama.services;

import com.example.labraporlama.exception.ResourceNotFoundException;
import com.example.labraporlama.model.Rapor;
import com.example.labraporlama.repository.RaporRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaporServisi {
    @Autowired
    private RaporRepository raporRepository;

    // Yeni bir rapor kaydeder
    public Rapor kaydetRapor(Rapor rapor) {
        return raporRepository.save(rapor);
    }

    // Mevcut bir raporu günceller
    public Rapor guncelleRapor(Long id, Rapor guncelRapor) {
        return raporRepository.findById(id).map(rapor -> {
            rapor.setDosyaNumarasi(guncelRapor.getDosyaNumarasi());
            rapor.setHastaAdi(guncelRapor.getHastaAdi());
            rapor.setHastaSoyadi(guncelRapor.getHastaSoyadi());
            rapor.setHastaKimlikNumarasi(guncelRapor.getHastaKimlikNumarasi());
            rapor.setTaniBasligi(guncelRapor.getTaniBasligi());
            rapor.setTaniDetaylari(guncelRapor.getTaniDetaylari());
            rapor.setRaporTarihi(guncelRapor.getRaporTarihi());
            rapor.setFotoYolu(guncelRapor.getFotoYolu());
            return raporRepository.save(rapor);
        }).orElseThrow(() -> new ResourceNotFoundException("Rapor id ile bulunamadı: " + id));
    }

    // Mevcut bir raporu siler
    public void silRapor(Long id) {
        raporRepository.deleteById(id);
    }

    // Tüm raporları getirir
    public List<Rapor> tumRaporlariGetir() {
        return raporRepository.findAll();
    }

    // Arama kriterlerine göre raporları getirir
    public List<Rapor> aramaRaporlari(String query) {
        return raporRepository.findByHastaAdiContainingOrHastaSoyadiContainingOrHastaKimlikNumarasiContaining(query, query, query);
    }

    // Raporları tarihine göre sıralar
    public List<Rapor> tariheGoreSirala() {
        return raporRepository.findByOrderByRaporTarihiAsc();
    }
}
