package com.marcosferrandiz.tema05.Strings;

import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Coje la primera letra y la hace mayusculas
     * @param palabra Coje la palabra introducida por el usuario
     * @return Devuelve la misma palabra, pero la primera en mayusculas
     */
    public static String ponerPrimeraLetraEnMayusculas(String palabra) {
        char caracterPrimero = palabra.toUpperCase().charAt(0);
        return caracterPrimero + palabra.substring(1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe una palabra con todo en minúsculas:");
        String palabra = input.nextLine();
        input.close();
        System.out.println(ponerPrimeraLetraEnMayusculas(palabra));

    }
}
