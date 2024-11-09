package com.marcosferrandiz.tema05.Strings;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio11 {
    public static void main(String[] args) {
        String nombre = IO.solicitarString("Ingrese su nombre",1,75);
        String primApell = IO.solicitarString("Ingrese su primer apellido", 1, 75);
        String secApell = IO.solicitarString("Ingrese su segundo apellido", 1,75);
        String nomComp = nombre + " "+ primApell + " "+ secApell;
        puntoA(nomComp);
        System.out.println();
        puntoB(nomComp);
        System.out.println();
        puntoC(nomComp);
        System.out.println();
        puntoD(nomComp);
        System.out.println();
        puntoE(nomComp);
        System.out.println();
        puntoF(nomComp);
        System.out.println();
        puntoG(nomComp);

    }

    /**
     * Muestra la frase en mayusculas, minusculas, y su longitud
     * @param frase Es la frase introducida por el usuario
     */
    public static void puntoA(String frase){
        System.out.println("Punto A:");
        System.out.println("Todo minusculas: "+ frase.toLowerCase());
        System.out.println("Todo mayusculas: "+ frase.toUpperCase());
        System.out.println("Longitud contando los espacios: " + frase.length());
    }

    /**
     * Muestra los 5 primeros caracteres de la frase, y si la frase es menor a 5, la muestra toda
     * @param frase Es la frase introducida por el usuario
     */
    public static void puntoB(String frase){
        System.out.println("Punto B:");
        if (frase.length() >= 5) {
            System.out.println(frase.substring(0,5));
        }else {
            System.out.println(frase);
        }
    }

    /**
     * Muestra los 2 ultimos caracteres de la frase, siempre y cuando la frase sea mayor a 2 caracteres
     * @param frase Es la frase introducida por el usuario
     */
    public static void puntoC(String frase){
        System.out.println("Punto C:");
        if (frase.length() >= 2) {
            System.out.println(frase.substring(frase.length()-2));
        }else {
            System.out.println(frase);
        }
    }

    /**
     * Muestrq el numero de ocurrencias del ultimo caracter de la frase
     * @param frase Es la frase introducida por el usuario
     */
    public static void puntoD(String frase){
        System.out.println("Punto D:");
        char letraFinal = frase.charAt(frase.length()-1);
        String letraFinalQueEs = frase.replaceAll("[^"+ letraFinal +"]","");
        int ocur = letraFinalQueEs.length();
        System.out.println("La ultima letra es "+ letraFinal+ " con una ocurrencia de "+ ocur + " veces");
    }

    /**
     * Pone en una misma cadena todas las ocurrencias de el primer caracter en mayusculas
     * @param frase Es la frase introducida por el usuario
     */
    public static void puntoE(String frase){
        System.out.println("Punto E:");
        char primLetra = frase.charAt(0);
        String primLetraSol = frase.replaceAll("[^"+ primLetra +"]","");
        System.out.println(primLetraSol.toUpperCase());
    }

    /**
     * Añade 3 * a la frase por delante y por detras
     * @param frase Es la frase introducida por el usuario
     */
    public static void puntoF(String frase){
        System.out.println("Punto F:");
        System.out.println("***"+frase+"***");
    }

    /**
     * Lee la frase introducida y la muestra del reves
     * @param frase Es la frase introducida por el usuario
     */
    public static void puntoG(String frase){
        StringBuilder sb = new StringBuilder();
        System.out.println("Punto G:");
        System.out.println(sb.append(frase).reverse());
    }
}
