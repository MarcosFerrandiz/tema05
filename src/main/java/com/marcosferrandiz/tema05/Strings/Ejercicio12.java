package com.marcosferrandiz.tema05.Strings;

public class Ejercicio12 {
    /**
     * Cambia todos los "es" por "no por" de una frase
     * @param frase Es la frase introducida por el usuario
     * @return Devuelve la frase con todos los "es" cambiados por "no por"
     */
    public static String sustituriEs(String frase){
        return frase.replaceAll("es","no por");
    }

    /**
     * Cambia todos los digitos de una frase por *
     * @param frase Frase intrducida por el usuario
     * @return Frase con los numeros con forma de *
     */
    public static String sustituirNumeros (String frase){
        return frase.replaceAll("\\d+","*");
    }

    public static void main(String[] args) {
        String frase = "esto1234es5678bueno900";
        System.out.println(sustituirNumeros(frase));
        System.out.println(sustituriEs(frase));
    }
}
