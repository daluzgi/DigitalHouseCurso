package com.company;
//CREO ATRIBUTOS
public class Auto {
    private String marca;
    private Integer kilometros;
    private String color;

    //CREO SETTERS
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setKilometros(Integer kilometros){
        this.kilometros = kilometros;
    }
    public void setColor(String color){
        this.color = color;
    }
    //CREO GETTERS
    public String getMarca(){
        return marca;
    }
    public  Integer getKilometros(){
        return kilometros;
    }
    public String getColor(){
        return color;
    }
}
