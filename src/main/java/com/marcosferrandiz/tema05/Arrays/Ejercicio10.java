package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        double[] arrayP = new double[TAMANYO_ARRAY];
        IO.solicitarDatosArray(arrayP);
        IO.arrayToString(arrayP,2);
        System.out.println(Arrays.toString(otroArray(arrayP)));

    }

    /**
     * Metodo que devulve si el valor del array si es mayor a 10 devuelve el numero tal cual, y si es menor devuelve -1
     * @param array Es el array introducido con sus valores
     * @return Devuelve si es menor de 10 (-1) o mayor a 10, devuelve el numero tal cual
     */
    public static double[] otroArray(double[] array){
        double[] array2 = new double[array.length];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > 10){
                array2[i] = array[i];
            } else if (array[i] <= 10){
                array2[i] = -1;
            }
        }
        return array2;
    }
}
