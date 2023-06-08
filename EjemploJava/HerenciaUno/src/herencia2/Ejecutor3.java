/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        
        System.out.printf("%s\n%s\n%s\n",
                "      >>Opciones<<     ",
                "1) Ingresar Estudiante Distancia",
                "2) Ingresar Estudiante Presencial");

        int opcion = entrada.nextInt();
        entrada.nextLine();
        if (opcion < 1 || opcion > 2) {
            System.out.println("Ingrese una de las dos opciones!!");
        } else {
            if (opcion == 1) {
                ingresarEstudianteDistancia();
            } else {
                if (opcion == 2) {
                    ingresarEstudiantePresencial();
                }
            }
        }     
    }
    
    public static void ingresarEstudianteDistancia(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese número de asignaturas");
        int asignaturas = entrada.nextInt();
        System.out.println("Ingrese costo asignatura");
        double costoAsignatura = entrada.nextDouble();

        EstudianteDistancia estudianteD = new EstudianteDistancia();

        estudianteD.establecerNombresEstudiante(nombres);
        estudianteD.establecerApellidoEstudiante(apellidos);
        estudianteD.establecerEdadEstudiante(edad);
        estudianteD.establecerIdentificacionEstudiante(identificacion);
        estudianteD.establecerNumeroAsginaturas(asignaturas);
        estudianteD.establecerCostoAsignatura(costoAsignatura);
        estudianteD.calcularMatriculaDistancia();

        System.out.printf("%s\n", estudianteD);

    }

    public static void ingresarEstudiantePresencial(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese número de creditos");
        int creditos = entrada.nextInt();
        System.out.println("Ingrese costo creditos");
        double costoCreditos = entrada.nextDouble();

        EstudiantePresencial estudianteP = new EstudiantePresencial();

        estudianteP.establecerNombresEstudiante(nombres);
        estudianteP.establecerApellidoEstudiante(apellidos);
        estudianteP.establecerEdadEstudiante(edad);
        estudianteP.establecerIdentificacionEstudiante(identificacion);
        estudianteP.establecerNumeroCreditos(creditos);
        estudianteP.establecerCostoCredito(costoCreditos);
        estudianteP.calcularMatriculaPresencial();

        System.out.printf("%s\n", estudianteP);
    }
}
