package com.company;

public class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }
    public boolean equals(Object obj){
        Profesor unProfesor = (Profesor) obj;
        return unProfesor.codigoDeProfesor.equals(this.codigoDeProfesor);
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }
}
