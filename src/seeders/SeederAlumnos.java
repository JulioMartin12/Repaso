package seeders;

import models.Alumno;

import java.util.ArrayList;

public final class SeederAlumnos {
    private ArrayList<Alumno> alumnos;

    public SeederAlumnos() {
        this.alumnos= new ArrayList<Alumno>();
        this.cargarAlumnos();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    private  void cargaEstudiante( Alumno alumno){
        this.alumnos.add(alumno);
    }

    private  void cargarAlumnos(){
        Alumno alumno1 = new Alumno("Juan","Perez");
        this.cargaEstudiante(alumno1);

        Alumno alumno2 = new Alumno("María","Gomez");
        this.cargaEstudiante(alumno2);

        Alumno alumno3 = new Alumno("Julio","Martín");
        this.cargaEstudiante(alumno3);

        Alumno alumno4 = new Alumno("Rocio","Ceballo");
        this.cargaEstudiante(alumno4);

        Alumno alumno5 = new Alumno("Victoria","Senna");
        this.cargaEstudiante(alumno5);

        Alumno alumno6 = new Alumno("Claudio","Franco");
        this.cargaEstudiante(alumno6);

        Alumno alumno7 = new Alumno("Silvia","Lopez");
        this.cargaEstudiante(alumno7);

        Alumno alumno8 = new Alumno("Claudia","Sanchez");
        this.cargaEstudiante(alumno8);

        Alumno alumno9 = new Alumno("Roberto","Figueroa");
        this.cargaEstudiante(alumno9);
        System.out.println(alumno9.toString());
    }
}
