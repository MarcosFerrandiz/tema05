package com.marcosferrandiz.tema05.Strings;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio10 {
    public static void main(String[] args) {
        String frase = IO.solicitarString("Escriba la palabra que quiera",1,75);
        System.out.println(esPalindroma(frase));
    }

    /**
     * Booleano que te dice si la palabra es Palindroma
     * @param frase La frase introducida por el usuario
     * @return Devuelve true o false depende de si es o no es Polindroma
     */
    public static boolean esPalindroma(String frase){
        StringBuilder sb = new StringBuilder();
        boolean result;
        frase = frase.toLowerCase();
        frase = frase.trim();
        sb.append(frase);
        String revFrase = sb.reverse().toString();
        result = frase.equals(revFrase);
        return result;
    }
}
