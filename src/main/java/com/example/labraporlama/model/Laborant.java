package com.example.labraporlama.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "laborants")
public class Laborant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Laborant adı
    private String adi;

    // Laborant soyadı
    private String soyadi;

    // Hastane kimlik numarası (7 haneli)
    private String hastaneKimlikNumarasi;

    // Laboranta ait raporlar

    // Getters ve Setters
}
