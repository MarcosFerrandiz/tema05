package com.marcosferrandiz.tema05.Strings;

public class Ejercicio3 {
    public static void main(String[] args) {
        String oracion = com.marcosferrandiz.tema04.libreria.IO.solicitarString("Introduzca la frase/palabra/lo que quieras: ",0,75 );
        System.out.println(contarEspacios(oracion));
    }

    /**
     * Cuanta la cantidad de espacios introducidos por el usuario
     * @param oracion Es la palabra/oracion/frase que introduce el usuario
     * @return Devuelve la cantidad de espacios que hay en la frase mediante un string
     */
    public static String contarEspacios(String oracion){
        int numEspacio = 0;
        for (int i = 0; i<= oracion.length()-1; i++){
            char caracter = oracion.charAt(i);
            switch (caracter){
                case ' '-> numEspacio++;
            }
        }
        return "Hay "+ numEspacio+" unidades de espacio";
    }

}
