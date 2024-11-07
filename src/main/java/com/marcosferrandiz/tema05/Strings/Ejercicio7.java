package com.marcosferrandiz.tema05.Strings;

public class Ejercicio7 {
    public static void main(String[] args) {
        String frase = com.marcosferrandiz.tema05.libreria.IO.solicitarString("Escriba la frase deseada",1,75);
        mostrarPalabrasPorLinea(frase);
    }

    /**
     * Muestra la frase pero cada palabra es en una linea aparte
     * @param frase Es la frase introducida por el usuario y lo muestra
     */
    public static void mostrarPalabrasPorLinea(String frase){
        String[] palabra = frase.split("\\s");
        for (int i = 0; i < palabra.length; i++){
            System.out.println(palabra[i]);
        }
    }
}
