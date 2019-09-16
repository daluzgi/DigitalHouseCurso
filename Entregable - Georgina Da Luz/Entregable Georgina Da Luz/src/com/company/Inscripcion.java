package com.company;

import java.util.Date;

public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private Date fechaDeInscripcion;

    public Inscripcion(Alumno alumno, Curso curso){
        this.alumno = alumno;
        this.curso = curso;
        this.fechaDeInscripcion = new Date();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }
        //public void inscribirUnAlumno(Alumno alumno, Curso curso){
         //   Inscripcion unaNuevaInscripcion = new Inscripcion(alumno, curso);
          //  System.out.println("La inscripcion se realizo correctamente");
       // }

}
