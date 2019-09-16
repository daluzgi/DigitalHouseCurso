package com.company;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager donDigitalHouseManager = new DigitalHouseManager();
        donDigitalHouseManager.altaProfesorAdjunto("Michael", "Jackson",0, 111, 200);
        donDigitalHouseManager.altaProfesorAdjunto("Mila", "Neso", 0,112, 300);
        donDigitalHouseManager.altaProfesorTitular("Lou", "Daluchi", 0,113, "Marketing");
        donDigitalHouseManager.altaProfesorTitular("Mora","Ngo", 0,114, "Innovacion");

        donDigitalHouseManager.altaCurso("Full Stack", 2001, 3);
        donDigitalHouseManager.altaCurso("Android", 2002, 2);

        donDigitalHouseManager.asignarProfesores(2001, 113, 111);
        donDigitalHouseManager.asignarProfesores(2002, 114, 112);

        donDigitalHouseManager.altaAlumno("Santiago", "Kamarov", 665);
        donDigitalHouseManager.altaAlumno("Damian", "Ingaramo", 666);
        donDigitalHouseManager.altaAlumno("Ariela", "Bajista", 667);

        donDigitalHouseManager.inscribirAlumno(665, 2001);
        donDigitalHouseManager.inscribirAlumno(666, 2001);

        donDigitalHouseManager.inscribirAlumno(667, 2002);
        donDigitalHouseManager.inscribirAlumno(665, 2002);
        donDigitalHouseManager.inscribirAlumno(666, 2002);

        donDigitalHouseManager.bajaProfesor(113);

        donDigitalHouseManager.bajaCurso(2001);















    }
}
