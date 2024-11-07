package com.marcosferrandiz.tema05.Strings;

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = com.marcosferrandiz.tema04.libreria.IO.solicitarString("Escriba la frase",1,75);
        mostrarPalabraMasLongitud(frase);
    }

    /**
     * Muestra palabra por palabra las palabras de la frase en una columna, y en la del al lado muetra los caracteres de cada palabra
     * @param frase Es la frase introducida por el usuario.
     */
    public static void mostrarPalabraMasLongitud(String frase){
        String[] palabra = frase.split("\\s");
        String pala;
        for (int i = 0; i< palabra.length; i++){
            pala = palabra[i];
            System.out.printf("%-20s %d\n", palabra[i], pala.length());
        }
    }
}
