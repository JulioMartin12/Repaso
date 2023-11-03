import models.Materia;
import seeders.SeederAlumnos;
import utils.UtilAlumno;
import utils.UtilMaterias;
import seeders.SeederMaterias;
import utils.UtilMaterias;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SeederMaterias cargaMaterias= new SeederMaterias();
        //System.out.println(cargaAutomatica.listaDeMaterias());
        SeederAlumnos  cargaAlumnos = new SeederAlumnos();
        cargarMenuPrincipal(cargaMaterias,cargaAlumnos);

    }

    public  static  void  cargarMenuPrincipal(SeederMaterias seederMaterias, SeederAlumnos seederAlumnos) {
        int opcion=99;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**************MENÚ*****************");
            System.out.println("1)Inscribirme");
            System.out.println("2)Ver Correlativas");
            System.out.println("3)Ver Mis materias");
            System.out.println("0)Salir del Programa");
            System.out.print("Ingrese una opcion: ");
          opcion= scanner.nextInt();
             long legajo = 999;
            switch (opcion){
                case 0:
                    System.out.print("Usted a salido del programa. Hasta la Próxima...");
                    break;
                case 1 :
                    cargarMenuInscripcion(seederMaterias,seederAlumnos);
                    break;
                case 2:
                    UtilMaterias.cargarMateriasPorAño(1, seederMaterias.getMaterias());
                    UtilMaterias.cargarMateriasPorAño(2, seederMaterias.getMaterias());
                    UtilMaterias.cargarMateriasPorAño(3, seederMaterias.getMaterias());
                    break;
                case 3:
                    System.out.print("Ingrese tu legajo:");
                    legajo=scanner.nextLong();
                   UtilAlumno.mostrarMaterias(legajo,seederAlumnos);

                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta");
                    break;
            }
        }while (opcion!=0);



    }

    public static void cargarMenuInscripcion(SeederMaterias seederMaterias, SeederAlumnos seederAlumnos){
        int opcion = 99;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("****************INSCRIPCIÓN**************");
            System.out.println("1) Materias de Primer Año.");
            System.out.println("2) Materias de Segundo Año.");
            System.out.println("3) Materias de tercer Año.");
            System.out.println("0) Salir del Programa.");
            System.out.print("Ingrese una Opción:");
            opcion=scanner.nextInt();
            long legajo = 999;
            long codigo=999;
            switch (opcion){
                case 0:
                    System.out.println("Usted a salido del modo de inscripción...");
                    break;
                case 1 :

                        UtilMaterias.cargarMateriasPorAño(opcion, seederMaterias.getMaterias());
                        System.out.print("Ingrese el código de la materia a inscribir:");
                        codigo=scanner.nextLong();
                        System.out.print("Ingrese tu legajo:");
                        legajo=scanner.nextLong();
                    System.out.println(UtilMaterias.inscribir(legajo,codigo,seederMaterias,seederAlumnos));
                    break;
                case 2:
                    UtilMaterias.cargarMateriasPorAño(opcion,seederMaterias.getMaterias());
                    System.out.print("Ingrese el código de la materia a inscribir:");
                    codigo=scanner.nextLong();
                    System.out.print("Ingrese tu legajo:");
                    legajo=scanner.nextLong();
                    System.out.println(UtilMaterias.inscribir(legajo,codigo,seederMaterias,seederAlumnos) );
                    break;
                case 3:
                    UtilMaterias.cargarMateriasPorAño(opcion,seederMaterias.getMaterias());
                    System.out.print("Ingrese el código de la materia a inscribir:");
                    codigo=scanner.nextLong();
                    System.out.print("Ingrese tu legajo:");
                    legajo=scanner.nextLong();
                    System.out.println(UtilMaterias.inscribir(legajo,codigo,seederMaterias,seederAlumnos) );
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta");
                    break;
            }

        }while (opcion!=0);

    }


    static public  void  cargarMenuDeMateriaPorAño(int año){

    }

}