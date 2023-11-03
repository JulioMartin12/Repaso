package models;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private  static  long contador = 0;
    private  long codigo;
    private String nombre;
    private int año;
    private List<Materia> correlativas;

    public Materia(String nombre, int año) {
        contador ++;
        this.codigo = contador;
        this.nombre = nombre;
        this.año = año;
        this.correlativas = new ArrayList<Materia>();
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", año=" + año +
                ", correlativas=" + correlativas +
                '}';
    }
}
