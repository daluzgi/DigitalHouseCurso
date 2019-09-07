package com.company;

public class Auto extends Vehiculo {

    public Auto(Integer velocidad, Double aceleracion, Integer anguloDeGiro, String patente){
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000, 4);
    }

    @Override
    public void correr() {
        super.correr();
    }
}
