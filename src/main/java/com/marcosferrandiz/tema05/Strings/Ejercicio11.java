package com.marcosferrandiz.tema05.Strings;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio11 {
    public static void main(String[] args) {
        String nombre = IO.solicitarString("Ingrese su nombre",1,75);
        String primApell = IO.solicitarString("Ingrese su primer apellido", 1, 75);
        String secApell = IO.solicitarString("Ingrese su segundo apellido", 1,75);
        String nomComp = nombre + " "+ primApell + " "+ secApell;

    }
    public static void puntoA(String frase){

    }
}
