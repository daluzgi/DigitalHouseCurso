package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class DigitalHouseManager {
    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager(){
        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripciones = new ArrayList<>();
    }

    public void altaCurso(String nombre, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos){
        Curso unCurso = new Curso(nombre,codigoDeCurso,cupoMaximoDeAlumnos);
                listaDeCursos.add(unCurso);
                System.out.println("Se agrego el curso correctamente");
            }

    public void bajaCurso(Integer codigoDeCurso){
        for (Curso unCurso : listaDeCursos){
           if (codigoDeCurso.equals(unCurso)){
               listaDeCursos.remove(unCurso);
           }

    }}
    public Curso buscarCursoPorCodigo( Integer unCodigoDeCurso) {
    return ;
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer cantidadDeHoras){

    }
    public void altaProfesorTitular(String nombre, String apellido, Integer codigoDeProfesor, String especialidad){

    }
    public void bajaProfesor(Integer codigoDeProfesor){

    }
    public void altaAlumno(String nombre, String apellido, Integer codigoDeAlumno){

    }
    public void inscribirAlumno(Integer codigoDeAlumno, Integer codigoDeCurso){

    }
    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){

    }
}
