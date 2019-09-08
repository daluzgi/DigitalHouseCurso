package com.company;

public class Main {

    public static void main(String[] args) {
	//CREO UN OBJETO
        Perro unPerro = new Perro();

        // INICIALIZAR EL NOMBRE, PESO Y RAZA DEL PERRO, ASIGNANDOLE VALORES Y LLAMANDO AL ATRIBUTO.
        unPerro.setNombre(" Moro");
        System.out.println("Mi perro de llama"+ unPerro.getNombre());

        unPerro.setPeso(3);
        System.out.println("Mi perro pesa "+ unPerro.getPeso()+ " KG");

        unPerro.setRaza("Caniche mini");
        System.out.println("Mi perro es un "+ unPerro.getRaza());
    }
}
