package seeders;

import models.Alumno;
import models.Materia;

import java.util.ArrayList;
import java.util.List;

public class SeederMaterias {
    private ArrayList<Materia> materias;


    public SeederMaterias() {
        this.materias= new ArrayList<Materia>();
        this.cargarMaterias();

    }
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    private  void cargarMaterias(){

        Materia primerAño11 = new Materia("Matemática Discreta", 1);
        this.carga(primerAño11);
        Materia primerAño12 = new Materia("Algoritmo de Datos", 1);
        this.carga(primerAño12);
        Materia primerAño13 = new Materia("Análisis Matemático 1", 1);
        this.carga(primerAño13);
        Materia primerAño14 = new Materia("Algebra y Geometría Análitica", 1);
        this.carga(primerAño14);
        Materia primerAño15 = new Materia("Sistemas y Organizaciones", 1);
        this.carga(primerAño15);
        Materia primerAño16 = new Materia("Arquitectura de Computadoras", 1);
        this.carga(primerAño16);
        Materia primerAño17 = new Materia("Física 1", 1);
        this.carga(primerAño17);
        Materia primerAño18 = new Materia("Inglés 1", 1);
        this.carga(primerAño18);

        Materia primerAño21 = new Materia("Análisis de Sistemas", 2);
        primerAño21.getCorrelativas().add(primerAño12);
        primerAño21.getCorrelativas().add(primerAño15);
        primerAño21.getCorrelativas().add(primerAño12);
        this.carga(primerAño21);

        Materia primerAño22 = new Materia("Paradigma", 2);
        primerAño22.getCorrelativas().add(primerAño11);
        primerAño22.getCorrelativas().add(primerAño12);
        this.carga(primerAño22);

        Materia primerAño23 = new Materia("Análisis Matemático 2", 2);
        primerAño23.getCorrelativas().add(primerAño13);
        primerAño23.getCorrelativas().add(primerAño14);
        this.carga(primerAño23);

        Materia primerAño24 = new Materia("Probabilidad Estadistica", 2);
        primerAño24.getCorrelativas().add(primerAño13);
        primerAño24.getCorrelativas().add(primerAño14);
        this.carga(primerAño24);

        Materia primerAño25 = new Materia("Sistemas Operativos", 2);
        primerAño25.getCorrelativas().add(primerAño11);
        primerAño25.getCorrelativas().add(primerAño16);
        this.carga(primerAño25);

        Materia primerAño26 = new Materia("Sintaxis ", 2);
        primerAño26.getCorrelativas().add(primerAño11);
        primerAño26.getCorrelativas().add(primerAño12);
        this.carga(primerAño26);

        Materia primerAño27 = new Materia("Física 2", 2);
        primerAño27.getCorrelativas().add(primerAño17);
        this.carga(primerAño27);

        Materia primerAño28 = new Materia("Inglés 2", 2);
        primerAño28.getCorrelativas().add(primerAño18);
        this.carga(primerAño28);


        Materia primerAño31 = new Materia("Diseño de Sistemas", 3);
        primerAño31.getCorrelativas().add(primerAño21);
        primerAño31.getCorrelativas().add(primerAño22);
        this.carga(primerAño31);

        Materia primerAño32 = new Materia("Matemática Superior", 3);
        primerAño32.getCorrelativas().add(primerAño23);
        primerAño32.getCorrelativas().add(primerAño24);
        this.carga(primerAño32);

        Materia primerAño33 = new Materia("gestión de Datos", 3);
        primerAño33.getCorrelativas().add(primerAño22);
        primerAño33.getCorrelativas().add(primerAño25);
        this.carga(primerAño33);

        Materia primerAño34 = new Materia("Economía", 3);
        primerAño34.getCorrelativas().add(primerAño21);
        this.carga(primerAño34);

        Materia primerAño35 = new Materia("Comunicaciones", 3);
        primerAño35.getCorrelativas().add(primerAño27);
        primerAño35.getCorrelativas().add(primerAño25);
        this.carga(primerAño35);

        Materia primerAño36 = new Materia("Sistema de Representación ", 3);
        primerAño36.getCorrelativas().add(primerAño21);
        this.carga(primerAño36);

        Materia primerAño37 = new Materia("Tecnología Educativa", 3);
        primerAño37.getCorrelativas().add(primerAño21);
        primerAño37.getCorrelativas().add(primerAño22);
        this.carga(primerAño37);

        Materia primerAño38 = new Materia("Inglés 3", 3);
        primerAño38.getCorrelativas().add(primerAño28);
        this.carga(primerAño38);

    }




    private  void carga( Materia materia){
        this.getMaterias().add(materia);
    }


    public String listaDeMaterias() {
        StringBuilder materiasTotales = new StringBuilder("Materias:");

        for (Materia materia : this.getMaterias()) {
            materiasTotales.append("\n").append(materia.toString());
        }

        return materiasTotales.toString();
    }

}
