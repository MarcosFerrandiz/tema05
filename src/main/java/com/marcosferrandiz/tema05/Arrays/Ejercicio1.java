package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] num = new double[10];
        double sumMedia = 0;
        IO.rellenarArrayAleatoriamente(num,0,10);
        System.out.println("Los números introducidos són...");
        System.out.println(IO.mostrarArrayComoToString(num,4));
        System.out.printf("\nLa media de los números anteriores es: %.2f\n", IO.mediaArray(num));
    }

}