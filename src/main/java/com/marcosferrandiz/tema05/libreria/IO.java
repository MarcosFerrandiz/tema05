package com.marcosferrandiz.tema05.libreria;

import java.util.Arrays;
import java.util.Random;
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

    public static Double solicitarDoubles(String mensaje, double numMin, double numMax){
        Scanner scanner = new Scanner(System.in);
        boolean valido;
        double num;

        do {
            System.out.println(mensaje);
            num = Double.parseDouble(scanner.nextLine());
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

    public static  void solicitarDatosArray(double[] array){
        Scanner input = new Scanner(System.in);
        if (array == null){
            return;
        }
        for (int i = 0; i < array.length; i++){
            System.out.printf("a[%d]?\n", i);
            array[i] = Double.parseDouble(input.nextLine());
        }
    }
    public static  void solicitarDatosArray(int[] array){
        Scanner input = new Scanner(System.in);
        if (array == null){
            return;
        }
        for (int i = 0; i < array.length; i++){
            System.out.printf("a[%d]?\n", i);
            array[i] = Integer.parseInt(input.nextLine());
        }
    }
    public static  void solicitarDatosArray(char[] array){
        Scanner input = new Scanner(System.in);
        if (array == null){
            return;
        }
        for (int i = 0; i < array.length; i++){
            System.out.printf("a[%d]?\n", i);
            array[i] = input.nextLine().charAt(0);
        }
    }

    public static String arrayToString(double[] array, int cantDecimales){
        if (array == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ",";
        String formato = "%."+ cantDecimales+"f";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                coma="";
            }
            sb.append(espacio).append(String.format(formato, array[i])).append(coma);
            if (i == 0){
                espacio =" ";
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static String arrayToString(int[] array, int cantDecimales){
        if (array == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ",";
        String formato = "%."+ cantDecimales+"f";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                coma="";
            }
            sb.append(espacio).append(String.format(formato, array[i])).append(coma);
            if (i == 0){
                espacio =" ";
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public enum Paridad{
        PARES, IMPARES;
    }

    public static String arrayToString(char[] array, Paridad paridad){
        final int NUM_ELEMENTOS = paridad == Paridad.PARES ? array.length/2 : array.length / 2 + 1;
        char[] resultado = new char[NUM_ELEMENTOS];
        int contador = 0;
        for (int i = paridad == Paridad.PARES ? 0 : 1; i < array.length; i+= 2) {
            resultado[contador++] = array[i];
        }
        return Arrays.toString(resultado);
    }

    public static double aleatorio(double valorMinimo, double valorMaximo){
        Random random = new Random();
        return valorMinimo + random.nextDouble() * (valorMaximo - valorMinimo);
    }
    public static int aleatorio(int valorMinimo, int valorMaximo){
        Random random = new Random();
        return valorMinimo + random.nextInt((valorMaximo - valorMinimo));
    }

    public static void rellenarArrayAleatoriamente(double[] array, double valorMinimo, double valorMaximo){
        Random random = new Random();
        for (int i = 0; i< array.length; i++){
            array[i] = aleatorio(valorMinimo, valorMaximo);
        }
    }
    public static void rellenarArrayAleatoriamente(int[] array, int valorMinimo, int valorMaximo){
        for (int i = 0; i< array.length; i++){
            array[i] = aleatorio(valorMinimo, valorMaximo);
        }
    }

    public static double mediaArray(double[] array){
        double suma = 0;
        for (double numero : array){
            suma += numero;
        }
        return suma / array.length;
    }

    public static int determinarLongitudMaxima(double[] array, int decimales) {
        int longitudMaxima = 0;
        String formato = "%." + decimales + "f";
        for (double numero : array) {
            int longitudActual = String.format(formato, numero).length();
            if (longitudMaxima < longitudActual) {
                longitudMaxima = longitudActual;
            }
        }
        return longitudMaxima;
    }

    public static String arrayToString(double[] array, int decimales, int columnas) {
        return arrayToString(array, decimales, columnas, 2);
    }

    public static String arrayToString(double[] array, int decimales, int columnas, int padding) {
        if (array == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int tamanyoColumna = determinarLongitudMaxima(array, decimales) + padding;
        String formato = "%" + tamanyoColumna + "." + decimales + "f";
        String formatoColumna = "%-" + tamanyoColumna + "s";
        for (int i = 0; i < array.length; i++) {
            sb.append(String.format(formatoColumna, String.format(formato, array[i])));
            if ((i + 1) % columnas == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static int[] sumarArrays(int[] array1, int[] array2, int tamanyoArray){
        int[] resultadoSuma = new int[tamanyoArray];
        for (int i = 0; i < resultadoSuma.length ; i++) {
            resultadoSuma[i] = array1[i] + array2[i];
        }
        return resultadoSuma;
    }

}
