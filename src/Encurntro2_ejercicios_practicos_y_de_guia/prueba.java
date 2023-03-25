/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encurntro2_ejercicios_practicos_y_de_guia;

/**
 *
 * @author FABIAN
 */
public class prueba {
      public static void main(String[] args){
          
int num1 = 5;
int num2 = 5;
int suma = num1 + num2;
double division = num1 / num2;
boolean logico = num2 < num1;
num1++;
System.out.println(suma);
System.out.println(division);
System.out.println(logico);
 int numero = (int) (Math.random() * 10); //genera numeros aleatorios de 0 a 10
System.out.println(numero); 

//para convertir cualquier tipo de dato a un String, utilicemos la función valueOf(n).
int numEntero = 4;
String numCadena = String.valueOf(numEntero);
//Si quisiéramos hacerlo al revés, de String a int se usa el método de la clase Integer, parseInt().
String numCadena = "1";
int numEntero = Integer.parseInt(numCadena);
         

}
}