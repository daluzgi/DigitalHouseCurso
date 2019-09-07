package com.company;

public class Main {

    public static void main(String[] args) {
	Pato miPatoRobertito = new Pato(12);
	Avion miAvion = new Avion(45);
	Superman miSuperman = new Superman(3);
	TorreDeContol miTorreDeControl = new TorreDeContol();

	miTorreDeControl.agregarVolador(miPatoRobertito);
	miTorreDeControl.agregarVolador(miAvion);
	miTorreDeControl.agregarVolador(miSuperman);

	miTorreDeControl.vuelenTodos();

    }



}
