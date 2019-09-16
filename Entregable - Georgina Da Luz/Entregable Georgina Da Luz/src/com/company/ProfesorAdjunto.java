package com.company;

public class ProfesorAdjunto extends Profesor {

    private Integer cantidadDeHorasDeConsulta;

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer cantidadDeHorasDeConsulta ){
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.cantidadDeHorasDeConsulta = cantidadDeHorasDeConsulta;
    }
}
