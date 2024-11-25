package com.marcosferrandiz.tema05.Busqueda_Ordenar;

import com.marcosferrandiz.tema05.libreria.IO;

public class BusquedaLineal {
    public static int busquedaLineal(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[50];
        IO.rellenarArrayAleatoriamente(array,1,100);
        int elementoABuscar = IO.solicitarEntero("Indique el numero a buscar",1,100);

        int resultado = busquedaLineal(array, elementoABuscar);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado en el array.");
        }
    }
}
