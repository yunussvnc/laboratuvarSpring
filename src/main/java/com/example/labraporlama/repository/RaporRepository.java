package com.example.labraporlama.repository;

import com.example.labraporlama.model.Rapor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaporRepository extends JpaRepository<Rapor, Long> {
    // Hasta adı, soyadı veya kimlik numarasına göre arama yapar
    List<Rapor> findByHastaAdiContainingOrHastaSoyadiContainingOrHastaKimlikNumarasiContaining(String adi, String soyadi, String kimlikNumarasi);

    // Raporları tarihine göre sıralar
    List<Rapor> findByOrderByRaporTarihiAsc();
}
