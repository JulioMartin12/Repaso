package models;

public class Inscripcion {
    private  Materia materia;
    private  boolean estado;

    public Inscripcion(Materia materia) {
        this.materia = materia;
        this.estado = false;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    private boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean aprobada(){
        return this.isEstado();
    }
}
