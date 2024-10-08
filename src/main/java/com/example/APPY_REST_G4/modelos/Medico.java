package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String nombre;//50 CARACTERES SOLO LETRAS
    private String matricula;//20 CARACTERES
    private String especialidad;//50 caracteres
    private Integer salario;// no pede sewr negativo// minimo 8000000 //maximo 3000000
    private String ips;//50 caracteres
    private String correo;//formato @sura.com.co
    private String telefono;//10 caracteres
    private String direccion;//100 caracteres
    private Boolean estaisponiblefindesemana;

}
