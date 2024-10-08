package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
 @Entity
 @Table(name = "medicamento")
public class Medicamento {
     @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String presentacion;
    private Double dosis;
    private String laboratorio;
    private LocalDate fechaCaducidad;
    private String contraindicaciones;
    private String registroINVIMA;
    private Boolean tieneCopago;
}
