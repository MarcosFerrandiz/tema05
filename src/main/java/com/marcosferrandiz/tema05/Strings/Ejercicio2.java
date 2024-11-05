package com.marcosferrandiz.tema05.Strings;

public class Ejercicio2 {
    public static void main(String[] args) {
        String oracion = com.marcosferrandiz.tema04.libreria.IO.solicitarString("Introduzca la frase/palabra/lo que quieras: ",0,75 );
        System.out.println(contarVocalesYConsonantes(oracion));
    }

    /**
     * Devuelve el total de vocales y consonates de una frase/palabra
     * @param oracion La frase/oracion/palabra que introduzca el usuario
     * @return Devuelve el total de vocales y consonantes
     */
    public static String contarVocalesYConsonantes(String oracion){
        int voc = 0;
        int cons = 0;
        oracion = oracion.toLowerCase();
        for (int i = 0; i <= oracion.length()-1; i++){
            char caracter = oracion.charAt(i);
            switch (caracter){
                case 'a','e','i','o','u' -> voc++;
                case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z' -> cons++;
                default -> {}
            }
        }
        return "La frase tiene un total de "+ cons +" consonantes, y un total de "+ voc +" vocales" ;
    }
}
