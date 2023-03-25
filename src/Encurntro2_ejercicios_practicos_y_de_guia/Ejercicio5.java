/*
* 5. Escribir un programa que lea un numero entero por teclado y muestre
*por pantalla el doble, el triple y la raiz cuadrada de ese numero.
*Nota: investigar la funcion  Math.sqrt().
 */
package Encurntro2_ejercicios_practicos_y_de_guia;

import java.util.Scanner;

/**
 *
 * @author FABIAN
 */
public class Ejercicio5 {
    public static void main(String[] args){
    System.out.println("este es el ejercicio 5");
    
     Scanner nuevo = new Scanner(System.in);
        
        int numero;
        int numero_doble;
        int numero_triple;
        
        System.out.println("Escribe un nùmero:");
        Scanner scan = new Scanner(System.in);
        
       // numero = scan.nextInt();
        numero = nuevo.nextInt();
        double raiz = Math.sqrt(numero);
        
        numero_doble = numero * 2;
        numero_triple = numero * 3;
        
        System.out.println("El doble de "+ numero + " es " + "[ " +  numero_doble + " ]");
        System.out.println("El triple de " + numero + " es " + "[ " + numero_triple + " ]");
        System.out.println("La raiz de "+ numero + " es " + "[ " + raiz + " ]");
    
}
}