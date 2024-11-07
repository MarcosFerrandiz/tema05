package com.marcosferrandiz.tema05.libreria;

import java.util.Scanner;

public class IO {
    /**
     * Solicita un texto y valida que su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrará al usuario
     * @param longitudMinima Número minimo de caracteres que debe tener el texto
     * @param longitudMaxima Número maximo de caracteres que debe tener un texto
     * @return El texto leido valido
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
        Scanner scanner = new Scanner(System.in);
        boolean valido;
        String resultado;
        do {
            System.out.println(mensaje);
            resultado = scanner.nextLine();
            valido = resultado.length() >= longitudMinima && resultado.length() <= longitudMaxima;
            if (!valido) {
                System.err.printf("La longitud no es correcta, deberá de estar entre %d - %d\n",longitudMinima,longitudMaxima);
            }
        }while (!valido);
        return resultado;
    }

    public static Integer solicitarEntero(String mensaje, int numMin, int numMax){
        Scanner scanner = new Scanner(System.in);
        boolean valido;
        int num;

        do {
            System.out.println(mensaje);
            num = Integer.parseInt(scanner.nextLine());
            valido = num >= numMin && num <= numMax;

            if (!valido){
                System.err.printf("El numero no es válido, debe de estar entre el %d - %d\n", numMin, numMax);
            }

        }while (!valido);
        return num;

    }

    public static int contarVocales(String texto){
        int vocales = 0;
        for (int i = 0; i < texto.length();i++){
            if (esVocal(texto.charAt(i))){
                vocales++;
            }
        }
        return vocales;
    }

    public static boolean esVocal(char c){
        c = Character.toLowerCase(c);
        String vocales = "aáàeéèiíìoóòuúù";
        return vocales.indexOf(c) >= 0;
    }


    public static boolean esConsonante(char c){
        return  Character.isLetter(c) && !esVocal(c);
    }

    public static int contarConsonante(String texto){
        int consonantes = 0;
        for (int i = 0; i < texto.length(); i++){
            if (esConsonante(texto.charAt(i)));
            consonantes++;
        }
        return consonantes;
    }

    public static int contarPalabras(String texto){
        texto = texto.trim();
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }
}
