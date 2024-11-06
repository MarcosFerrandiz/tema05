package com.marcosferrandiz.tema05.Strings;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = com.marcosferrandiz.tema04.libreria.IO.solicitarString("Escriba la frase que quiera", 1,75);
        int facto = com.marcosferrandiz.tema04.libreria.IO.solicitarEntero("Indique el factor de multiplicacion",1,10);
        System.out.println(repetirFraseXVeces(frase, facto));
    }

    /**
     * Repite las veces que haya introducido el usuario la frase escrita
     * @param frase Es la frase escrita por el usuario
     * @param repeticion Es la cantidad de veces que se va a tener que escribir la frase
     * @return Devuelve la frase escrita las veces indicadas
     */
    public static String repetirFraseXVeces(String frase, int repeticion){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeticion; i++){
            sb.append(frase).append("\n");
        }
        return sb.toString();
    }
}
