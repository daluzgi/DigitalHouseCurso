package com.company;

public class Main {

    public static void main(String[] args) {
	Hermano unHermano = new Hermano();

	unHermano.setNombre("Emiliano");
        System.out.println("Mi hermano se llama " + unHermano.getNombre());

    unHermano.setEdad(30);
        System.out.println("Mi hermano tiene " + unHermano.getEdad());

    unHermano.setPasatiempo("Crossfit");
        System.out.println("El pasatiempo de mi hermano es hacer "+ unHermano.getPasatiempo());
    }
}
