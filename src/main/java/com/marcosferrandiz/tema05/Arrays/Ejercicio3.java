package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] num = new int[20];
        solicitarNumerosCantidadDeVeces(num);
        mostrarEpicaTablaDeEsas(num);
    }

    /**
     * Solicita un número del 1 al 999 la cantidad de veces que sea el array
     * @param num Es el array con la cantidad de veces
     */
    public static void solicitarNumerosCantidadDeVeces(int[] num){
        for (int i = 0; i< num.length; i++){
            num[i] = IO.solicitarEntero("Introduzca el número deseado:",1,999);
        }
    }

    /**
     * Muestra una tabla de 4 de ancho con todos los numeros del array
     * @param num Es el array con todos los numeros
     */
    public static void mostrarEpicaTablaDeEsas(int[] num){
        System.out.println("-----------------------------------------");
        for (int i = 0; i< num.length;i++){
            System.out.print(num[i] + " ");
            if ((i + 1) % 4 == 0){
                System.out.println();
            }
        }
    }
}
