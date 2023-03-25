/*
*4. Dada una cantidad de grados centígrados se debe mostrar su
*equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package Encurntro2_ejercicios_practicos_y_de_guia;

import java.util.Scanner;

/**
 *
 * @author FABIAN
 */
public class Ejercicio4 {
    public static void main(String[] args){
    System.out.println("este es el ejercicio 4");
    
    Scanner numero = new Scanner(System.in);
        int C;
        int F;
        int resultado;
        System.out.println("Ingresar el grado");
        C = numero.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println("En grados Fahrenheit son: " + F);
    
} // fin main
} // fin class
