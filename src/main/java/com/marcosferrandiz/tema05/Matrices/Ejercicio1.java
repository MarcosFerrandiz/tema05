package com.marcosferrandiz.tema05.Matrices;

import com.marcosferrandiz.tema05.libreria.IO;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Formattable;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int filas = IO.solicitarEntero("Introduzca el numero de filas que desee:",0,75);
        int columnas = IO.solicitarEntero("Introduzca el numero de columnas que desee:",0,75);
        double[][] matriz = crearMatriz(filas,columnas);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j< matriz[i].length; j++){
                System.out.printf("%.4f ",matriz[i][j]);
            }

        }
    }

    /**
     * Dependiendo de unos parametros te hace una matriz u otra, dependiendo del tamaño indicado
     * @param filas numeros de filas introducidos por el usuario
     * @param columnas numero de columnas introducidos por el usuario
     * @return Devuelve la matriz rellenada con las cosas que ha puesto el usuario
     */
    public static double[][] crearMatriz(int filas, int columnas){
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <matriz[i].length; j++){
                System.out.printf("Introduzca el valor que quiera a la fila %d columna %d", i, j);
                matriz[i][j] = Double.parseDouble(input.nextLine());
            }
        }
        return matriz;
    }
}
