package com.marcosferrandiz.tema05.Arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        char[] caract = new char[10];
        solicitarCaracteres(caract);
        mostrarArraysPares(caract);
        mostrarArraysImpares(caract);
    }

    /**
     * Solicita para introducir caracteres la cantidad de veces de arrays
     * @param caract Es el array creado con todos los caracteres para saber la cantidad de veces que se debe de solicitar
     */
    public static void solicitarCaracteres(char[] caract){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < caract.length; i++){
            System.out.println("Introduzca el carácter deseado:");
            caract[i] = input.next().charAt(0);
        }
    }

    /**
     * Muestra los caracteres pares del array
     * @param caract Es el array creado con todos los caracteres
     */
    public static void mostrarArraysPares(char[] caract){
        System.out.println("Caracteres en posiciones de arrays pares:");
        for (int i = 0; i < caract.length; i+=2){
            System.out.print(caract[i]+", ");
        }
        System.out.println();
    }

    /**
     * Muestra los caracteres impares del array
     * @param caract Es el array creado con todos los caracteres
     */
    public static void mostrarArraysImpares(char[] caract){
        System.out.println("Caracteres en posiciones de arrays impares:");
        for (int i = 1; i < caract.length; i+=2){
            System.out.print(caract[i]+", ");
        }
        System.out.println();
    }
}
