/*
*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
*y después toda en minúsculas.

*Nota: investigar la función toUpperCase() y toLowerCase() en Java
 */
package Encurntro2_ejercicios_practicos_y_de_guia;

import java.util.Scanner;

/**
 *
 * @author FABIAN
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
    System.out.println("este es el ejercicio 3");
    
     String palabra = " ";
        Scanner hp = new Scanner(System.in);
        System.out.println("Ingresa la frase");
        palabra = hp.nextLine();
        //System.out.println(palabra.toLowerCase());
        System.out.println(palabra.toUpperCase());
}
}