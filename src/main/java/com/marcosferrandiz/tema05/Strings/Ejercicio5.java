package com.marcosferrandiz.tema05.Strings;


public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = com.marcosferrandiz.tema05.libreria.IO.solicitarString("Escriba la frase que quiera",1,111);
        System.out.println(palabraMasLarga(frase));
    }

    /**
     * Coje una frase que introduzca el usuario y busca la palabra mas larga y la muestra por pantalla junto a su longitud
     * @param frase Es la frase introducida por el usuario
     * @return Devuelve la palabra mas larga de la frase y su cantidad de caracteres
     */
    public static String palabraMasLarga(String frase){
        StringBuilder sb = new StringBuilder();
        frase = frase.toLowerCase();
        String pala;
        int longitud;
        int totalLetras = 0;
        String palabraLarga = "";
        String[] palabra = frase.split("\\s");
        for (int i = 0; i< palabra.length; i++){
            pala = palabra[i];
            longitud = pala.length();
            if (longitud>=totalLetras){
                totalLetras = longitud;
                palabraLarga = pala;
            }
        }
        sb.append("La palabra mas larga introducida es la palabra ").append(palabraLarga).append(" con un total de ").append(totalLetras).append(" caracteres/letras");
        return sb.toString();
    }
}