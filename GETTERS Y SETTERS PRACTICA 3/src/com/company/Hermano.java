package com.company;

public class Hermano {
    private String nombre;
    private Integer edad;
    private String pasatiempo;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public void setPasatiempo(String pasatiempo){
        this.pasatiempo = pasatiempo;
    }

    public String getNombre(){
        return nombre;
    }
    public Integer getEdad(){
        return edad;
    }
    public String getPasatiempo(){
        return pasatiempo;
    }
}
