package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 50;
        int[] arrayV = new int[TAMANYO_ARRAY];
        IO.rellenarArrayAleatoriamente(arrayV,0,51);
        System.out.println(Arrays.toString(arrayV));

        System.out.println(Arrays.toString(generarUnaArrayP(arrayV)));

    }

    /**
     * Coje el array introducido y va sumando cada elemento en el anterior y el resultado lo va guardando en cada elemento del array P
     * @param array Es el array que debemos de introducir para sumar
     * @return Devuelve el arrayP con sus respectivos resultados de las sumas en cada elemento
     */
    public static int[] generarUnaArrayP(int[] array){
        int[] arrayP = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayP[i] = array[i];
            for (int j = 0; j < i; j++){
                arrayP[i] = arrayP[i] + array[j];
            }
        }
        return arrayP;
    }
}
