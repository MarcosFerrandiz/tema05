package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio5 {
    public static void main(String[] args) {
        int cantidad = IO.solicitarEntero("Introduzca la cantidad de personas que quiera introducir su estatura",1,75);
        final int TAMANYO_ARRAY = cantidad;
        double[] array = new double[TAMANYO_ARRAY];
        System.out.println("Introduzca la estatura en metros o cm, pero todas con la misma unidad de medida");
        IO.solicitarDatosArray(array);
        double media = IO.mediaArray(array);
        System.out.printf("La media de estatura es: %.2f\n",media);
        estaturasMayorMedia(array,media);
    }

    /**
     * Muestra por pantalla todas las estaturas por encima de la media
     * @param array
     * @param media
     */
    public static void estaturasMayorMedia(double[] array, double media){
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > media){
                System.out.printf("La estatura %.2f es superior a la media\n", array[i]);
            }
        }
    }
}
