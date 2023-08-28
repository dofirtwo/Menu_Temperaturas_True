/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_temperaturas_true;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Menu_Temperaturas_True {
    static Scanner teclado = new Scanner (System.in);
    static double tempMin[][] = new double[2][7]; 
    static double tempMax[][] = new double[2][7]; 
    static String dias[] = new String[7];
    private static double numeroMenor;
    private static double numeroMayor;
    private static double Mayor;
    private static double Menor;
private static void Dias(){
    dias[0]="Lunes";
    dias[1]="Martes";
    dias[2]="Miercoles";
    dias[3]="Jueves";
    dias[4]="Viernes";
    dias[5]="Sabado";
    dias[6]="Domingo";
}
private static void EntradaDatos(){
    System.out.println("Ingresando datos..."); 
    Dias(); 
    for (int fila = 0; fila <= 1; fila++) {
        for (int columna = 0; columna < 7; columna++) {
            System.out.print("ingrese la temperatura ");
            if (fila==0) {
                System.out.println("ingrese la temperatura menor del "+dias[columna]);
                tempMin[fila][columna]=teclado.nextDouble();
                numeroMenor=tempMin[fila][columna];
            }
            if (fila==1) {
                System.out.println("ingrese la temperatura mayor del "+dias[columna]);
                tempMax[fila][columna]=teclado.nextDouble();
                numeroMayor=tempMax[fila][columna];
            } 
        }
    }   
}
private static void temperaturaMinima(){
for (int fila = 0; fila < tempMin.length; fila++  ) {
        for (int columna = 0; columna < tempMin[fila].length; columna++) {      
     if (tempMin[fila][columna] < numeroMenor) {
     numeroMenor=tempMin[fila][columna];
    }
    }
    System.out.println("La temperatura minima de la semana fue: "+numeroMenor);
  }
}   
private static void tempMaxima(){  
for (int fila = 0; fila < tempMax.length; fila++) {
        for (int columna = 0; columna < tempMax[fila].length; columna++) {      
     if (tempMax[fila][columna] > numeroMayor) {
         numeroMayor = tempMax[fila][columna];
    }
    }
    Mayor=numeroMayor;
  }
} 
private static void temperaturaDias(){
        int columna=0 ;
    System.out.println("las temperatura mas bajas de la semana fueron:");
    System.out.println(Arrays.toString(tempMin[columna]));
    System.out.println("las temperaturas mas alta de la semana fueron:");
    System.out.println(Arrays.toString(tempMax[columna]));
}
public static void main(String[] args) {
    menu();
}

    private static void menu() {
    int opcion;
    do{
        System.out.println("\tMENU DE OPCIONES");
        System.out.println("\t1. Ingresar temperaturas");
        System.out.println("\t2. Consultar temperatura maxima");
        System.out.println("\t3. Consultar temperatura minima");
        System.out.println("\t4. Listar temperatura de todos los dias");
        System.out.println("\t5. Salir");
        System.out.println("Ingrese opcion: ");
        opcion=teclado.nextInt();
        switch(opcion){
            case 1:EntradaDatos();
                break;
            case 2:tempMaxima();
                System.out.println("La temperatura maxima de la semana fue: "+Mayor);
                break;
            case 3:temperaturaMinima();
                break;
            case 4:temperaturaDias();
                break;
            case 5:
                System.out.println("Cerrando");
                break;
            default:
                System.out.println("Opcion errada");
                break;
        }
    }while(opcion!=5);
    }
}