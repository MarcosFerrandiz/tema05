package com.marcosferrandiz.tema05.Strings;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio16 {
    public static void main(String[] args) {
        int dni = solicitarDNI();
        System.out.println("Su NIF es: "+ calcularNIF(dni));
    }

    /**
     * Solicita un DNI y valida que esté introducido correctamente
     * @return Devuelve el DNI
     */
    public static int solicitarDNI(){
        String dni;
        boolean vali = false;
        do {
            dni = IO.solicitarString("Introduzca su DNI:  ",1,100).trim();

            vali = dni.length() == 8;
            if (!vali){
                System.err.println("Valor introducido no valido, pruebe otra vez");
            }

        }while(!vali);
        return Integer.parseInt(dni);
    }

    /**
     * Calcula el DNI y le pone la letra que le corresponde al DNI para hacer el NIF
     * @param dni es el DNI introducido por el usuario sin la letra
     * @return Devuelve el NIF con la letra
     */
    public static String calcularNIF(int dni){
        StringBuilder sb = new StringBuilder();
        int num = dni % 23;
        String letra = switch (num){
            case 0 -> "T";
            case 1 -> "R";
            case 2 -> "W";
            case 3 -> "A";
            case 4 -> "G";
            case 5 -> "M";
            case 6 -> "Y";
            case 7 -> "F";
            case 8 -> "P";
            case 9 -> "D";
            case 10 -> "X";
            case 11 -> "B";
            case 12 -> "N";
            case 13 -> "J";
            case 14 -> "Z";
            case 15 -> "S";
            case 16 -> "Q";
            case 17 -> "V";
            case 18 -> "H";
            case 19 -> "L";
            case 20 -> "C";
            case 21 -> "K";
            case 22 -> "E";
            default -> "error";
        };
        return sb.append(dni).append(letra).toString();
    }
}
