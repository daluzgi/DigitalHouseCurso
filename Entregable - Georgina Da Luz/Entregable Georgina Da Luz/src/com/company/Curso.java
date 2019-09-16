package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private  Integer codigoDeCurso;
    private Profesor profesorTitular;
    private Profesor profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnos;

public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos) {
    this.nombre = nombre;
    this.codigoDeCurso = codigoDeCurso;
    this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
    this.listaDeAlumnos = new ArrayList<>();
}

    public void setProfesorTitular(Profesor profesorTitular){
        this.profesorTitular = profesorTitular;

    }

    public void setProfesorAdjunto(Profesor profesorAdjunto){
        this.profesorAdjunto = profesorAdjunto;
    }



    public Integer getCodigoDeCurso(){
        return codigoDeCurso;
    }

    public Integer getCupoMaximoDeAlumnos() {
        return cupoMaximoDeAlumnos;
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
        System.out.println("Se agrego el alumno correctamente");
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
