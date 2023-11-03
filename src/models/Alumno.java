package models;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private  static  long contador = 700;
    private long legajo;
    private String nombre;
    private String apellido;
    private ArrayList<Inscripcion> inscripciones;

    public Alumno(String nombre, String apellido) {
        contador ++;
        this.legajo = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.inscripciones = new ArrayList<Inscripcion>();
    }

    public long getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                mostrarInscripciones() +
                '}';
    }

    public String mostrarInscripciones(){
        String materias="\n----Mis Materias---\n" ;
        for (Inscripcion materia:this.getInscripciones()
             ) {
            if (materia.aprobada()) {
               materias+= materia.getMateria().getAño() + "° Año " + materia.getMateria().getNombre() + " APROBADA\n";
            } else {
                materias+=materia.getMateria().getAño() + "° Año " + materia.getMateria().getNombre() + " NO Aprobada\n";

            }

        }
        return  materias;
    }
}
