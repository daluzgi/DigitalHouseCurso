package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private  Integer codigoDeCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnos;

public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos) {
    this.nombre = nombre;
    this.codigoDeCurso = codigoDeCurso;
    this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
    this.listaDeAlumnos = new ArrayList<>();

}
    public Integer getCodigoDeCurso(){
        return codigoDeCurso;
    }



    public boolean equals(Object obj) {
        Curso unCurso = (Curso) obj;
        return unCurso.codigoDeCurso.equals(this.codigoDeCurso);

    }
public boolean hayCupo() {
    return listaDeAlumnos.size() < cupoMaximoDeAlumnos;
}
public Boolean agregarUnAlumno(Alumno unAlumno){

    if(hayCupo()) {
        listaDeAlumnos.add(unAlumno);
        System.out.println("Se agreg[o el alumno correctamente");
        return true;
    }else{
        System.out.println("No hay cupo");
        return false;
    }
        }

    public void eliminarUnAlumno(Alumno unAlumno){
        if(listaDeAlumnos.remove(unAlumno)) {
        System.out.println("El alumno se borro correctamente");
    }else{
        System.out.println("No se puede eliminar el alumno");}
}}
