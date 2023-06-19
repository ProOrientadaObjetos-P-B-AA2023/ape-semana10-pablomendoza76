/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
import paquete4.InstitucionEducativa;
import paquete2.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

public class ejecutor {
    public static void main(String[] args) {
        boolean i = true;
        ArrayList<PrestamoAutomovil>autos = new ArrayList<>();
        ArrayList<PrestamoEducativo>educativo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (i) {
        System.out.println("----Bienvenido----");
        System.out.println("1: Ingresar Prestamo Automovil");
        System.out.println("2: Ingresar Prestamo Educativo");
        System.out.println("0: SALIR");
            System.out.print("Escoja una opción: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Persona per;
                Persona gar;
                System.out.println("PRESTAMO AUTOMOVIL");
                System.out.println("Ingrese: NOMBRE, APELLIDO y NOMBRE DE USUARIO");
                per = new Persona(sc.next(),sc.next(),sc.next());
                System.out.println("Ingrese datos del Garante");
                System.out.println("NOMBRE, APELLIDO y NOMBRE DE USUARIO");
                gar = new Persona(sc.next(),sc.next(),sc.next());
                System.out.println("Ingrese datos del prestamo");
                System.out.println("TIEMPO PRESTAMO, CIUDAD PRESTAMO, TIPO AUTO, TIPO MARCA, VALOR AUTO");
                autos.add(new PrestamoAutomovil(per,sc.nextInt(),sc.next(),sc.next(),sc.next(),gar,sc.nextDouble() ));
                break;
            case 2:
                Persona per1;
                InstitucionEducativa ins;
                System.out.println("PRESTAMO EDUCATIVO");
                System.out.println("Ingrese NOMBRE, APELLIDO, NOMBRE DE USUARIO");
                per1 = new Persona(sc.next(), sc.next(), sc.next());
                System.out.println("Ingrese NOMBRE DE INSTITUCIÓN, SIGLAS");
                ins = new InstitucionEducativa(sc.next(), sc.next());
                System.out.println("Ingrese TIEMPO PRESTAMO, CIUDAD PRESTAMO, NIVEL DE ESTUDIO, VALOR DE LA CARRERA");
                educativo.add(new PrestamoEducativo(per1,sc.nextInt(),sc.next(), sc.next(),ins,sc.nextDouble()));
                break;
            case 0:
                System.out.println("PRESTAMOS AUTOMOVILES");
                for (PrestamoAutomovil prestamo : autos) {
                    prestamo.CalularValorMensualA();
                    System.out.println(prestamo);
                }
                System.out.println("PRESTAMOS EDUCATIVOS");
                for (PrestamoEducativo edu : educativo) {
                    edu.CalcularValorMensualE();
                    System.out.println(edu);
                }
                i = false;
                break;
            }
        }
    }
}