package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "signovital")
public class SignoVital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String valor;
    private LocalDate fechaMedida;

}
