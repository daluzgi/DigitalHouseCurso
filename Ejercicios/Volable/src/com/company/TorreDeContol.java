package com.company;

import java.util.ArrayList;

public class TorreDeContol {
    private ArrayList<Volable> listaDeVoladores = new ArrayList<>();

    //CONSTRUCTORES NO LLEVA PORQUE NO ME DICEN COMO QUIEREN QUE CONSTRUYA LA TORRE DE CONTROL

    //METODOS
    public void vuelenTodos(){
        for(Integer i=0; i<listaDeVoladores.size(); i++){
            Volable unVolable = listaDeVoladores.get(i);
            unVolable.volar();
        }
    }

    public void agregarVolador(Volable unVolable){
        listaDeVoladores.add(unVolable);
    }

}
