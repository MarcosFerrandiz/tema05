package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int sumMedia = 0;

        for (int i =0; i < num.length; i++){
            num[i] = IO.solicitarEntero("Introduzca el número desdeado:",1,75);
            sumMedia += num[i];
        }

        System.out.println("Los números introducidos són...");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + ", ");
        }

        System.out.println("\nLa media de los números anteriores es: "+ calcularMedia(sumMedia, num.length));
    }

    /**
     * Calcula la media de los números
     * @param num Es la suma de todos los números
     * @param dividir Es el numero por el que se va a dividir, es decir, la cantidad de números
     * @return Devuelve la media
     */
    public static double calcularMedia(int num, int dividir){
        double media = (double) num / dividir;
        return media;
    }
}