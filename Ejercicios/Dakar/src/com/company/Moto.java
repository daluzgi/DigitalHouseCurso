package com.company;

public class Moto extends Vehiculo {

    public Moto(Integer velocidad, Double aceleracion, Integer anguloDeGiro, String patente){
        super(velocidad, aceleracion, anguloDeGiro, patente, 300, 2);
    }

    @Override
    public void correr() {
        super.correr();
    }
}




