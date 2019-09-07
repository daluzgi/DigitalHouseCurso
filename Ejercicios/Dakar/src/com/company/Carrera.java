package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private Integer distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo>listaDeVehiculos = new ArrayList<>();
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(Integer distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, List listaDeVehiculos)
    {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = listaDeVehiculos;
            }

    public void darDeAltaAuto(Integer velocidad, Double aceleracion, Integer anguloDeGiro, String patente){
        if (cantidadDeVehiculosPermitidos<listaDeVehiculos.size()){
            Auto auto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
            listaDeVehiculos.add(auto);
        } else{
            System.out.println("No hay mas cupos para autos");
        }
            }
            public void darDeAltaMoto(Integer velocidad, Double aceleracion, Integer anguloDeGiro, String patente){
                if (cantidadDeVehiculosPermitidos<listaDeVehiculos.size()){
                    Moto moto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
                    listaDeVehiculos.add(moto);
                } else{
                    System.out.println("No hay mas cupos para motos");
                }
            }
            public void eliminarVehiculo(Vehiculo vehiculo){

                listaDeVehiculos.remove(vehiculo);
            }

            public void eliminarVehiculoConPatente(String unaPatente){
                Vehiculo vehiculoRemover = null;
                for(Vehiculo vehiculo : listaDeVehiculos){
                    if (vehiculo.getPatente().equals(unaPatente)){
                        vehiculoRemover = vehiculo;
                    }
                }
                listaDeVehiculos.remove(vehiculoRemover);
            }


            public String ganadorDeCarrera(){
                Vehiculo vehiculoGanador = listaDeVehiculos.get(0);
                for (Vehiculo vehiculo : listaDeVehiculos) {
                    if(vehiculo.calcularPuntaje() > vehiculoGanador.calcularPuntaje()){
                        vehiculoGanador = vehiculo;
                    }
                }


                System.out.println("ganador: " + vehiculoGanador);
            }
            public void socorrerUnaMoto(String patente){
                System.out.println("Socorri una moto");
            }
            public void socorrerUnAuto(String patente){
                System.out.println("Socorri un auto");
            }

}
