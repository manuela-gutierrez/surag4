package com.example.APPY_REST_G4.helpers.validaciones;

import com.example.APPY_REST_G4.modelos.Paciente;

public class PacienteValidacion {

    // inyecccion de dependencias
    //LLAMAR UNA CLASE DENTRO DE OTRA
    private Paciente paciente= new Paciente();

    //CREARUN METODO PARA CADA DATO QUE DEBO VALIDAR
    public Boolean validarNombre(){
        return true;
    }
    public Boolean validarFechaNacimiento(){
        return true;
    }
    public Boolean validarCiudad(){
        return true;
    }
    public Boolean validarCorreo(){
        return true;
    }
    public Boolean validarTelefono(){
        return true;
    }
    public Boolean validarGrupoIngresos(){
        return true;
    }
    public Boolean validarFechaAfiliacion(){
        return true;
    }
}
