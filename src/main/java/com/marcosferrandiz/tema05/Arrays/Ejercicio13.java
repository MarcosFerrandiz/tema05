package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 50;
        int[] arrayV = new int[TAMANYO_ARRAY];
        IO.rellenarArrayAleatoriamente(arrayV,1,100);

        if (contarPares(arrayV) <= 0){
            System.err.println("No hay pares LoL, anda que para que no haya ya es mala suerte");
        }else {
            int[] arrayP = new int[contarPares(arrayV)];
            System.out.println("ArrayV:");
            System.out.println(Arrays.toString(arrayV));
            System.out.println("Array P:");
            System.out.println(Arrays.toString(arrayConLosParesSolo(arrayV)));
        }
    }

    /**
     * Cuenta la cantidad de pares que hay en un array
     * @param array El array el cual queremos saber los pares
     * @return Devuelve la cantidad de pares
     */
    public static int contarPares(int[] array){
        int cuenta = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                cuenta += 1;
            }
        }
        return cuenta;
    }

    /**
     * Devuelve el arrayP con solo los pares
     * @param array Es el array introducido el cual solo quieres saber los pares
     * @return Devuelve el arrayP el cual solo hay pares
     */
    public static int[] arrayConLosParesSolo(int[] array){
        int j = 0;
        int[] arrayP = new int[contarPares(array)];
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                arrayP[j] = array[i];
                j++;
            }
        }
        return arrayP;
    }
}
