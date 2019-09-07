package com.company;

import java.lang.reflect.Constructor;

public class Vehiculo {
    private Integer velocidad;
    private Double aceleracion;
    private Integer anguloDeGiro;
    private String patente;
    private Integer peso;
    private Integer rueda;

    public Vehiculo(Integer velocidad, Double aceleracion, Integer anguloDeGiro, String patente, Integer peso, Integer rueda){
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.rueda = rueda;
    }

    public String getPatente() {
        return patente;
    }

    public void correr(){
        System.out.println("Corro");
    }

    public Double calcularPuntaje(){
        return velocidad  1⁄2 Aceleracion / (AnguloDeGiro*(Peso-Cantidad de Ruedas * 100);

    }


}
