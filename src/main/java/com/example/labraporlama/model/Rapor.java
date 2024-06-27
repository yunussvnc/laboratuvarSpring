package com.example.labraporlama.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "rapors")
public class Rapor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long laborantId;
    private Long dosyaNumarasi;
    private String hastaAdi;
    private String hastaSoyadi;
    private String hastaKimlikNumarasi;
    private String taniBasligi;
    private String taniDetaylari;
    private Date raporTarihi;
    private String fotoYolu;




}
