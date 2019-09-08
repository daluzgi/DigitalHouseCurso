package com.company;

public class Main {

    public static void main(String[] args) {
	//CREO EL OBJETO unAuto
        Auto unAuto = new Auto();

	//ESTABLEZCO LA MARCA DE AUTO Y LLAMO AL ATRIBUTO DE LA CLASE 1
        unAuto.setMarca("Volkswagen");
        System.out.println("La marca del auto es " + unAuto.getMarca());

        // ESTABLEZCO LOS KILOMETROS DEL AUTO Y LLAMO AL ATRIBUTO DE LA CLASE 1
        unAuto.setKilometros(50000);
        System.out.println("El auto tiene "+ unAuto.getKilometros()+ " KM");

        //ESTABLEZCO EL COLOR DEL AUTO Y LLAMO AL ATRIBUTO
        unAuto.setColor("Rojo");
        System.out.println("El auto es "+ unAuto.getColor());
    }
}
