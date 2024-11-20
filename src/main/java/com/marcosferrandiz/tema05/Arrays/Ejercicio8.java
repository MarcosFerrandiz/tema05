package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        double numeroABuscar = IO.solicitarDoubles("Indique el numero que quieras buscar:",1,1.03);
        double[] array = new double[TAMANYO_ARRAY];
        String resultado = comprobarSiEstaElNumero(array,numeroABuscar) ? "El número " + numeroABuscar+ " esta en el array " + Arrays.toString(array) : "El numero "+ numeroABuscar + " no está en ningun lado";
        System.out.println(resultado);
    }

    /**
     * Booleano que comprueba si un numero esta en un array especificado
     * @param array Es el array en el cual queremos mirar si esta en numero introducido
     * @param numero Es el numero introducido
     * @return Devuelve un true o false
     */
    public static boolean comprobarSiEstaElNumero(double[] array, double numero) {
        boolean coincide = false;
        for (double num : array) {
            if (num == numero){
                coincide = true;
                break;
            }
        }
        return coincide;
    }
}
