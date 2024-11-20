package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        int[] array1 = new int[TAMANYO_ARRAY];
        int[] array2 = new int[TAMANYO_ARRAY];
        IO.rellenarArrayAleatoriamente(array1,1,11);
        IO.rellenarArrayAleatoriamente(array2,1,11);
        System.out.println("La suma de los arrays es de: " + Arrays.toString(sumarArrays(array1, array2)));
        System.out.println("La division de los arrays es de: " + Arrays.toString(dividirArrays(array1, array2)));
    }
    public static int[] sumarArrays(int[] array1, int[] array2){
        int[] resultadoSuma = new int[array1.length];
        for (int i = 0; i < resultadoSuma.length ; i++) {
            resultadoSuma[i] = array1[i] + array2[i];
        }
        return resultadoSuma;
    }
    public static float[] dividirArrays(int[] array1, int[] array2){
        float[] resultadoDivision = new float[array1.length];
        for (int i = 0; i < resultadoDivision.length ; i++) {
            resultadoDivision[i] = (float) array1[i] / array2[i];
        }
        return resultadoDivision;
    }
}
