package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio7 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 100;
        int[] array = new int[TAMANYO_ARRAY];
        IO.rellenarArrayAleatoriamente(array,1,10);
        System.out.println("Numeros multiplos de 10:");
        imprimirMultiplos10(array);
        System.out.println("\nNumeros multiplos de 5:");
        imprimirMultiplos5(array);
        System.out.println("\nCeros:");
        imprimir0(array);
    }

    /**
     * Imprime los numeros multiples de 10
     * @param array Es el array con los numeros
     */
    public static void imprimirMultiplos10(int[] array) {
        for (int numero : array) {
            if (numero % 10 == 0 && numero != 0) {
                System.out.print(numero + " ");
            }
        }
    }

    /**
     * Imprime los numeros multiplos de 5
     * @param array Es el array con los numeros
     */
    public static void imprimirMultiplos5(int[] array) {
        for (int numero : array) {
            if (numero % 5 == 0 && numero != 0) {
                System.out.print(numero + " ");
            }
        }
    }

    /**
     * Imprimo los ceros que salen
     * @param array Es el array con los numeros
     */
    public static void imprimir0(int[] array) {
        for (int numero : array) {
            if (numero == 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
