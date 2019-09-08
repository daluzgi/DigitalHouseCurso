package com.company;

public class Perro {

    //CREO LOS ATRIBUTOS
    private String nombre;
    private Integer peso;
    private String raza;

    //CREO LOS METODOS ACCESORES

    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPeso(Integer peso){
        this.peso = peso;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public Integer getPeso(){
        return peso;
    }
    public String getRaza(){
        return raza;
    }
}
