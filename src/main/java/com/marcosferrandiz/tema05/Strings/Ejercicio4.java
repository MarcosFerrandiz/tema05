package com.marcosferrandiz.tema05.Strings;

public class Ejercicio4 {
    public static void main(String[] args) {
        String frase = com.marcosferrandiz.tema04.libreria.IO.solicitarString("Escriba la frase que quieras", 1, 75);
        System.out.println(separarPalabrasYContarVocYCons(frase));

    }

    /**
     * Coje la frase introducida por el usuario separa las palabras y las introcude en dierentes arrays, luego cuenta la cantidad de vocales y la de consonantes por palabra
     * @param frase Frase introducida por el usuario
     * @return Devuelve un string con la cantidad de vocales y consonantes por palabra
     */
    public static String separarPalabrasYContarVocYCons(String frase) {
        StringBuilder sb = new StringBuilder();
        frase = frase.toLowerCase();
        String pala = "";
        String[] palabra = frase.split("\\s");
        int voc;
        int cons;
        int contador = 0;
        for (int cambiaVariable = 0; cambiaVariable < palabra.length; cambiaVariable++) {
            pala = palabra[cambiaVariable];
            voc = 0;
            cons = 0;
            for (int j = 0; j < pala.length(); j++) {
                char caracter = pala.charAt(j);
                switch (caracter) {
                    case 'a', 'e', 'i', 'o', 'u' -> voc++;
                    case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v',
                         'w', 'x', 'y', 'z' -> cons++;
                }
            }
            contador++;
            sb.append("La palabra numero ").append(contador).append(" tiene ").append(cons).append(" consonantes y ").append(voc).append(" vocales\n");
        }
        return sb.toString();
    }
}

