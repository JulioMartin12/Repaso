package utils;

import models.Alumno;
import models.Inscripcion;
import models.Materia;
import seeders.SeederAlumnos;
import seeders.SeederMaterias;

import java.util.ArrayList;

public final class UtilMaterias {


    public static void cargarMateriasPorAño(int año, ArrayList<Materia> lista){
        System.out.println("+++++++++++++Materias de " + año+"°++++++++++++++++");
        for (Materia materia:lista
             ) {
            if(año == materia.getAño()){
                System.out.println("--Código:"+ materia.getCodigo()+" "+ materia.getNombre());
               if(!materia.getCorrelativas().isEmpty()){
                   System.out.println("----- Correlativas Aprobadas. -----");
                   for (Materia correlativa: materia.getCorrelativas()
                        ) {
                       System.out.println("        "+correlativa.getNombre());
                   }

               }
            }
        }

    }

    public static String inscribir(long legajo, long codigo, SeederMaterias seederMaterias, SeederAlumnos seederAlumnos){
    String mensaje = "Salida";
    Alumno alumnoInscribir = UtilAlumno.existeAlumno( legajo,seederAlumnos);
    Materia materiaInscribir = existeMateria(codigo,seederMaterias);
       if(alumnoInscribir !=null){

       }else{
           return "Error, El legajo del alumno no existe.";
       }

        if(materiaInscribir !=null){

        }else{
            return "Error, La materia no existe.";
        }

        if(alumnoTieneEsaMateria(legajo, codigo,seederAlumnos)!= null){

        }else{
            return "Error, Usted ya tiene inscripta esa materia.";
        }

        if( tieneAprobadasCorrelativas(legajo,codigo,seederMaterias,seederAlumnos)){
            Inscripcion inscripcion= new Inscripcion(materiaInscribir);
            alumnoInscribir.getInscripciones().add(inscripcion);
         return "Se registro la incripción con éxito!!!";

        }else{
            return "Error, Usted no cumple con la condición de correlativas aprobadas para cursar la materia.";
        }

    }


    private  static Materia existeMateria(long codigo,  SeederMaterias seederMaterias){
        Materia materia= null;
        for (Materia mate: seederMaterias.getMaterias()
        ) {
            if(mate.getCodigo()== codigo){
                materia=mate;
            }
        }
        return  materia;
    }


    private  static  boolean tieneAprobadasCorrelativas(long legajo, long codigo, SeederMaterias seederMaterias, SeederAlumnos seederAlumnos){
        Alumno alumno = UtilAlumno.existeAlumno( legajo,seederAlumnos);
        int contadorAprobadas=0;
        Materia materiaInscribir = existeMateria(codigo,seederMaterias);
        for (Materia materia: materiaInscribir.getCorrelativas()
             ) {
            for (Inscripcion aprobada: alumno.getInscripciones()
                 ) {
                  if(materia.getCodigo() == aprobada.getMateria().getCodigo() && aprobada.aprobada() ){
                      contadorAprobadas++;
                  }
            }

        }
        return contadorAprobadas == materiaInscribir.getCorrelativas().size();
    }
    private  static Alumno alumnoTieneEsaMateria(long legajo, long codigo, SeederAlumnos seederAlumnos){
        Alumno alumnoInscribir= null;
        boolean materiaInscripta= false;
        for (Alumno alumno: seederAlumnos.getAlumnos()
        ) {
            if(alumno.getLegajo()== legajo){
                for (Inscripcion inscripcion : alumno.getInscripciones()
                        ) {
                    if(inscripcion.getMateria().getCodigo() == codigo){
                        materiaInscripta=true;
                    }
                }
                if(!materiaInscripta){
                    alumnoInscribir=alumno;
                }
            }
        }
        return  alumnoInscribir;
    }


}
