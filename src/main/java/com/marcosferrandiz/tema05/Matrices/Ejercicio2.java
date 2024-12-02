package com.marcosferrandiz.tema05.Matrices;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arrayV = IO.rellenarArrayAleatoriamente(50, 1, 10);
        int[] arrayP = IO.rellenarArrayAleatoriamente(20, 1, 10);
        int[][] matriz = multiplicacionArraysMatriz(arrayV, arrayP);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", (matriz[i][j]));
            }
            System.out.println();
        }
    }

    /**
     * Multiplica los arrays introducidos por el usuario, creadno una matriz con los resultados
     * @param arrayFilas Es el primer array introducido por el usuario
     * @param arrayColumnas Es el segundo array introducido por el usuario
     * @return Devuelve una matriz con los resultados de la multiplicacion
     */
    public static int[][] multiplicacionArraysMatriz(int[] arrayFilas, int[] arrayColumnas){
        int[][] matriz = new int[arrayFilas.length][arrayColumnas.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = arrayFilas[i] * arrayColumnas[j];
            }
        }
        return matriz;
    }
}
