package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        double[] array = new double[TAMANYO_ARRAY];
        char[] arrayChar = new char[TAMANYO_ARRAY];
        IO.solicitarDatosArray(arrayChar);

        System.out.println(Arrays.toString(arrayChar));
        System.out.println(IO.arrayToString (arrayChar, IO.Paridad.PARES));

    }
}