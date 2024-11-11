package com.marcosferrandiz.tema05.Strings;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio13 {
    /**
     * Muestra el menú, y ya
     */
    public static int mostrarMenu(){

        int deci;
        boolean valido = false;
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println("1. Palabra más larga.");
            System.out.println("2. Palabra más corta.");
            System.out.println("3. Numero de vocales.");
            System.out.println("------------------------------------");
            System.out.println("0. Salir");
            deci = IO.solicitarEntero("",0,3);
            valido = deci >=0 && deci <= 3;

        }while (!valido);
        return deci;
    }

    public static void palabraMasLarga(){
        String pal1 = IO.solicitarString("Ingrese la primera palabra",1,75);
        String pal2 = IO.solicitarString("Ingrese la segunda palabra",1,75);
        String pal3 = IO.solicitarString("Ingrese la tercera palabra",1,75);
        String palMasLarga = pal1;
        if (pal2.length() > palMasLarga.length()){
            palMasLarga = pal2;
        }
        if (pal3.length()>palMasLarga.length()){
            palMasLarga = pal3;
        }
        System.out.printf("La palabra mas larga es: %s", palMasLarga);
    }

    public static void palabraMasCorta(){
        String pal1 = IO.solicitarString("Ingrese la primera palabra",1,75);
        String pal2 = IO.solicitarString("Ingrese la segunda palabra",1,75);
        String pal3 = IO.solicitarString("Ingrese la tercera palabra",1,75);
        String palMasCorta = pal1;
        if (pal2.length() < palMasCorta.length()){
            palMasCorta = pal2;
        }
        if (pal3.length() < palMasCorta.length()){
            palMasCorta = pal3;
        }
        System.out.printf("La palabra mas corta es: %s", palMasCorta);
    }

    public static void contarVocales(){
        String palabra = IO.solicitarString("Introduzca una palabra", 1, 75);
        String voc = "aeiouáéíóúàèìòùAEIOUÁÉÍÓÚÀÈÌÒÙ";
        int contVoc = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (voc.indexOf(palabra.charAt(i)) != -1) {
                contVoc++;
            }
        }

        System.out.println("La palabra contiene " + contVoc + " vocales.");
    }

    public static void main(String[] args) {
        int deci;
        switch (deci = mostrarMenu()){
            case 1 -> palabraMasLarga();
            case 2 -> palabraMasCorta();
            case 3 -> contarVocales();
            case 0 ->  {
                break;
            }
        }
    }
}
