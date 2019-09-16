package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
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
                System.out.println("Se agrego el curso correctamente.");
    }

    public void bajaCurso(Integer unCodigoDeCurso){
      Curso cursoAEliminar = buscarCursoPorCodigo(unCodigoDeCurso);
      listaDeCursos.remove(cursoAEliminar);
        System.out.println("El curso se elimino correctamente");

    }

    public Curso buscarCursoPorCodigo( Integer CodigoDeCurso){
        Curso unCursoBuscado = null;
   for (Curso unCurso:listaDeCursos){
       if (unCurso.getCodigoDeCurso().equals(CodigoDeCurso));
       unCursoBuscado = unCurso;
   }
        return unCursoBuscado;
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer antiguedad,  Integer codigoDeProfesor, Integer cantidadDeHoras){
        ProfesorAdjunto unProfesorAdjunto = new ProfesorAdjunto(nombre, apellido, 0, codigoDeProfesor, cantidadDeHoras);
        listaDeProfesores.add(unProfesorAdjunto);
        System.out.println("El Profesor Adjunto se agrego correctamente");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, String especialidad){
        ProfesorTitular unProfesorTitular = new ProfesorTitular(nombre, apellido, 0, codigoDeProfesor, especialidad);
        listaDeProfesores.add(unProfesorTitular);
        System.out.println("El profesor titular fue agregado correctamente");
    }

    public Profesor buscarProfesor(Integer codigoDeProfesor){
        Profesor unProfesorBuscado = null;
        for(Profesor unProfesor : listaDeProfesores){
            if (unProfesor.getCodigoDeProfesor().equals(codigoDeProfesor));
            unProfesorBuscado = unProfesor;
        }
        return unProfesorBuscado;
    }

    public void bajaProfesor(Integer codigoDeProfesor){
        Profesor profesorAEliminar = buscarProfesor(codigoDeProfesor);
        listaDeProfesores.remove(profesorAEliminar);
        System.out.println("El profesor se elimino correctamente");
    }



    public void altaAlumno(String nombre, String apellido, Integer codigoDeAlumno) {
        Alumno unAlumno = new Alumno(nombre, apellido, codigoDeAlumno);
        listaDeAlumnos.add(unAlumno);
        System.out.println("Se agrego al alumno correctamente.");
    }

        public Alumno buscarAlumno(Integer codigoDeAlumno){
            Alumno unAlumnoBuscado = null;
            for(Alumno alumnoBuscado : listaDeAlumnos){
                if (alumnoBuscado.getCodigoDeAlumno().equals(codigoDeAlumno));
                unAlumnoBuscado = alumnoBuscado;
            }
            return unAlumnoBuscado;
    }
    
    public void inscribirAlumno(Integer codigoDeAlumno, Integer codigoDeCurso){
        Curso unCurso = buscarCursoPorCodigo(codigoDeCurso);
        Alumno unAlumno = buscarAlumno(codigoDeAlumno);

        if (unCurso.hayCupo()) {
           unCurso.agregarUnAlumno(unAlumno);
            Inscripcion unaNuevaInscripcion = new Inscripcion(unAlumno, unCurso);
            listaDeInscripciones.add(unaNuevaInscripcion);
            System.out.println("La inscripcion se realizo correctamente");
            }
        else {
            System.out.println("La inscripcion no se puede realizar porque no hay cupo");
        }}



    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        Profesor unProfesorTitular = buscarProfesor(codigoProfesorTitular);
        Profesor unProfesorAdjunto = buscarProfesor(codigoProfesorAdjunto);
        Curso cursoEncontrado = buscarCursoPorCodigo(codigoCurso);
        cursoEncontrado.setProfesorTitular(unProfesorTitular);
        cursoEncontrado.setProfesorAdjunto(unProfesorAdjunto);

    }
}
