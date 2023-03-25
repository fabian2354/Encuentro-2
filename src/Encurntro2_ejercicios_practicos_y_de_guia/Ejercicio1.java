/*
*1. Escribir un programa que pida dos números enteros por teclado y calcule
*la suma de los dos. El programa deberá después mostrar el resultado de
*la suma.
 */
package Encurntro2_ejercicios_practicos_y_de_guia;

import java.util.Scanner;

/**
 *
 * @author FABIAN
 */
public class Ejercicio1 {
    public static void main(String[] args){
        System.out.println("este es el ejercicio 1");
        
         int num1,num2;
Scanner in = new Scanner (System.in);
System.out.println("ingrese 2 numeros para sumar");
num1 = in.nextInt();
num2 = in.nextInt();
System.out.println("resultado es: " + (num1 + num2));
    
}// fin main
} // fin class
