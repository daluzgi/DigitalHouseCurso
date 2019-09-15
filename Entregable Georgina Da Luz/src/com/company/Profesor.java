package com.company;

public class Profesor {
    private String nombre;
    private String apellido;
    private Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer codigoDeProfesor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeProfesor = codigoDeProfesor;
    }
    public boolean equals(Object obj){
        Profesor unProfesor = (Profesor) obj;
        return unProfesor.codigoDeProfesor.equals(this.codigoDeProfesor);
    }



}
