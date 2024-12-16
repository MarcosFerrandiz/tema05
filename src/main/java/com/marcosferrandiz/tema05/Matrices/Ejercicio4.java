package com.marcosferrandiz.tema05.Matrices;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio4 {
    /**
     * Muestra la matriz por filas, como una matriz normal
     * @param matriz Es la matriz que queremos mostrar por filas
     */
    public static void matrizPorFilas(int[][] matriz) {
        System.out.println("Matriz por filas:");
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.printf("%-3d",numero);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    /**
     * Muestra la matriz de forma traspuesta, es decir las filas pasan a ser columnas y las columnas filas
     * @param matriz Es la matriz que queremos trasponer
     * @return Devuelve una nueva matriz que es la matriz que le introducimos pero traspuesta
     */
    public static int[][] matrizTraspuesta(int[][] matriz) {
        if (matriz == null) {
            return null;
        }
        int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTraspuesta.length; i++) {
            for (int j = 0; j < matrizTraspuesta[i].length; j++) {
                matrizTraspuesta[i][j] = matriz[j][i];
            }

        }
        return matrizTraspuesta;
    }

    /**
     * Muestra por pantalla al final de la matriz la suma de los valores de cada fila
     * @param matriz Es la matriz en la cual vamos a sumar las filas y mostrar al final la suma de los valores de cada fila
     */
    public static void matrizPorFilasConSuma(int[][] matriz) {
        System.out.println("Matriz por filas con suma al final:");
        int suma;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                System.out.printf("%-3d",matriz[i][j]);
            }
            System.out.print("= " + suma);
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    /**
     * Muestra por pantalla el valor maximo y el valor minimo de una matriz por pantalla
     * @param matriz Es la matriz la cual queremos saber el valor maximo y el minmo
     */
    public static void valoresMaximoMinimoMatriz(int[][] matriz) {
        int valorMinimo = matriz[0][0];
        int valorMaximo = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (valorMinimo > matriz[i][j]) {
                    valorMinimo = matriz[i][j];
                }
                if (valorMaximo < matriz[i][j]) {
                    valorMaximo = matriz[i][j];
                }
            }
        }
        System.out.println("Valores mínimo y máximo de la matriz:");
        System.out.println("Mínimo: " + valorMinimo);
        System.out.println("Máximo: " + valorMaximo);
        System.out.println("---------------------------");

    }

    /**
     * Saca la media de los valores de una matriz
     * @param matriz Es la matriz la cual queremos sacar la media
     * @return Devuelve la media de todos los valores en forma de double
     */
    public static double mediaMatriz(int[][] matriz) {
        int contador = 0;
        int total = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                contador++;
                total += numero;
            }
        }
        return total / (double)contador;
    }

    /**
     * En la columna 8 muestra la suma de los valores de cada fila
     * @param matriz Es la matriz que queremos sumar
     */
    public static void columnaOchoValorAnteriores(int[][] matriz) {
        System.out.println("En la columna 8 el valor de todas los anteriores:");
        int suma;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length-1; j++) {
                suma += matriz[i][j];
                System.out.printf("%-3d",matriz[i][j]);
            }
            System.out.printf("%d\n",suma);
        }
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        int [][] matriz = IO.rellenarMatrizAleatoriamente(4,8,1,10);
        matrizPorFilas(matriz);
        int[][] matrizTraspuesta = matrizTraspuesta(matriz);
        System.out.println("Matriz por columnas (traspuesta):");
        for (int[] fila : matrizTraspuesta) {
            for (int numero : fila) {
                System.out.printf("%-3d",numero);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        matrizPorFilasConSuma(matriz);
        valoresMaximoMinimoMatriz(matriz);
        double media = mediaMatriz(matriz);
        System.out.println("Media de la matriz:");
        System.out.println("La media de los valores de la matriz es: "+media);
        System.out.println("---------------------------");
        System.out.println("El valor en la fila, columna que diga el usuario:");
        int fila = IO.solicitarEntero("Dime la fila:",0,matriz.length);
        int columna = IO.solicitarEntero("Dime la columna:",0,matriz[0].length);
        System.out.println("El valor es: " + matriz[fila][columna]);
        System.out.println("---------------------------");
        System.out.println("La fila que diga el usuario:");
        int filaEntera = IO.solicitarEntero("Dime la fila:",0,matriz.length);
        System.out.print("Fila: ");
        for (int i = 0; i < matriz[filaEntera].length; i++) {
            System.out.printf("%-3d",matriz[filaEntera][i]);
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("La columna que diga el usuario:");
        int columnaEntera = IO.solicitarEntero("Dime la columna:", 0, matriz[0].length);
        System.out.println("Columna: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][columnaEntera]);
        }
        System.out.println("---------------------------");
        columnaOchoValorAnteriores(matriz);

    }
}
