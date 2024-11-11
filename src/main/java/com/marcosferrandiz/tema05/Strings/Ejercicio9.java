package com.marcosferrandiz.tema05.Strings;

public class Ejercicio9 {
    public static void main(String[] args) {
        String frase = com.marcosferrandiz.tema05.libreria.IO.solicitarString("Escriba la frase que quiera",1,75);
        System.out.println(posicionesImpares(frase));
    }

    /**
     * Coje la frase introducida por el usuarioo y solo escribe las letras impares
     * @param frase La frese introducida por el usuario
     * @return Devuelve la frase pero solo los caracteres impares
     */
    public static String posicionesImpares(String frase){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frase.length(); i += 2){
            sb.append(frase.charAt(i));
        }
        return sb.toString();
    }
}
