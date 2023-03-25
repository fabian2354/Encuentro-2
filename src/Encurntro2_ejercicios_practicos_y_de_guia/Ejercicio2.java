/*
*2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
*muestre por pantalla.
 */
package Encurntro2_ejercicios_practicos_y_de_guia;

import java.util.Scanner;

/**
 *
 * @author FABIAN
 */
public class Ejercicio2 {
        public static void main(String[] args){
        System.out.println("este es el ejercicio 2");
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Hola! soy " + nombre + " y estoy programando");
        
       
    
}// fin main
} // fin class
