package com.company;

public class ProfesorAdjunto extends Profesor {

    private Integer cantidadDeHorasDeConsulta;

    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer cantidadDeHorasDeConsulta ){
        super(nombre, apellido, codigoDeProfesor);
        this.cantidadDeHorasDeConsulta = cantidadDeHorasDeConsulta;
    }
}
