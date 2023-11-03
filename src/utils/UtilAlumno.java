package utils;

import models.Alumno;
import models.Inscripcion;
import models.Materia;
import seeders.SeederAlumnos;
import seeders.SeederMaterias;

public final class UtilAlumno {

    public  static  void mostrarMaterias(long legajo, SeederAlumnos seederAlumnos) {
        Alumno alumno = existeAlumno(legajo, seederAlumnos);
          if( alumno != null){
            System.out.println("-------------Estado de las Materias-------------");
            for (Inscripcion materia : alumno.getInscripciones()
            ) {
                if (materia.aprobada()) {
                    System.out.println(materia.getMateria().getAño() + "° Año" + materia.getMateria().getNombre() + " APROBADA");
                } else {
                    System.out.println(materia.getMateria().getAño() + "° Año" + materia.getMateria().getNombre() + " NO Aprobada");

                }
            }
        }

    }

   public static Alumno existeAlumno(long legajo, SeederAlumnos seederAlumnos){
        Alumno alumnoInscribir= null;
        for (Alumno alumno: seederAlumnos.getAlumnos()
        ) {
            if(alumno.getLegajo()== legajo){
                alumnoInscribir=alumno;
            }
        }
        return  alumnoInscribir;
    }
}
