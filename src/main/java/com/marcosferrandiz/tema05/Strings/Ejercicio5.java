package com.marcosferrandiz.tema05.Strings;


public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = com.marcosferrandiz.tema04.libreria.IO.solicitarString("Escriba la frase que quiera",1,75);
        System.out.println(palabraMasLarga(frase));
    }

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
        sb.append("La palabra mas larga introducida es la palabra "+ palabraLarga+" con un total de "+totalLetras+" caracteres/letras");
        return sb.toString();
    }
}