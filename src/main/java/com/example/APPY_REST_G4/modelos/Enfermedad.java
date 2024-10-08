package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad")
public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String gradp;
    private Double probabilidadVivir;
}
