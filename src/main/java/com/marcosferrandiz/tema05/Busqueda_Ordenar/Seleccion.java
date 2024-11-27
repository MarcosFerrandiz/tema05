package com.marcosferrandiz.tema05.Busqueda_Ordenar;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;

public class Seleccion {
    public static void main(String[] args) {
        int[] array = new int[10];
        IO.rellenarArrayAleatoriamente(array,1,11);
        System.out.println(Arrays.toString(array));
        ordenaSeleccion(array);
    }
    public static void ordenaSeleccion(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int min = array[i];
            int posicion = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    posicion = j;
                }
            }
            if (min < array[i]){
                Burbuja.intercambio(array,i,posicion);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
