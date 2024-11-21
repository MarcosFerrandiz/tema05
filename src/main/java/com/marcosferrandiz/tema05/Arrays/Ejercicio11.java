package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        int[] arrayV = new int[TAMANYO_ARRAY];
        IO.rellenarArrayAleatoriamente(arrayV,0,11);
        System.out.println("El array V contiene:");
        System.out.println(Arrays.toString(arrayV));
        System.out.println("El array P contiene:");
        System.out.println(Arrays.toString(ordenarArrayInversamente(arrayV)));


    }

    /**
     * Coje un array V y lo pasa a otro array P de forma inversa, es decir, el primero en el ultimo, etc
     * @param array Es el array al que le quieres dar vuelta
     * @return Devuelve el array de forma inversa
     */
    public static int[] ordenarArrayInversamente(int[] array){
        int cuenta = 0;
        int[] arrayP = new int[array.length];
        for (int i = array.length-1; i >= 0 ; i--) {
            arrayP[cuenta] = array[i];
            cuenta++;
        }
        return arrayP;
    }
}
