package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 30;
        double[] array = new double[TAMANYO_ARRAY];
        IO.rellenarArrayAleatoriamente(array,0,10);
        System.out.printf("La nota media total es de %.2f\n", IO.mediaArray(array));
        System.out.printf("La nota media de los aprobados es de %.2f", calcularMediaNotaMayor5(array));
    }

    /**
     * Calcula la media de la gente que ha aprobado
     * @param array Es el array con las notas
     * @return Devuelve la media de notas de la gente que ha aprobado
     */
    public static double calcularMediaNotaMayor5(double[] array){
        int cont = 0;
        double sumaMayores5 = 0;
        for (double nota : array) {
            if (nota >= 5){
                sumaMayores5 += nota;
                cont++;
            }
        }
        return (sumaMayores5 / cont);
    }
}
