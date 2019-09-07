package com.company;

public class Avion implements Volable {
   //ATRIBUTOS
    private Integer horasDeVuelo;

    //CONSTRUCTOR
    public Avion(Integer horasDeVuelo){
        this.horasDeVuelo = horasDeVuelo;
    }

    //METODO
    public void volar(){
        horasDeVuelo = horasDeVuelo + 13;
        System.out.println("Estoy volando como un Avión.");
    }

}
