package com.marcosferrandiz.tema05.Busqueda_Ordenar;

import com.marcosferrandiz.tema05.libreria.IO;

public class BusquedaBinaria {
    public static int busquedaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (array[medio] == elemento) {
                return medio;
            }
            if (array[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[50];
        IO.rellenarArrayAleatoriamente(array,1,100);
        int elementoABuscar = IO.solicitarEntero("Indique el numero a buscar",1,100);
        int resultado = busquedaBinaria(array, elementoABuscar);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado en el array.");
        }
    }
}
