package com.marcosferrandiz.tema05.Strings;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio18 {
    public static void main(String[] args) {
        String fecha = solicitarFecha();
        int numeroSuerte = calcularNumeroDeLaSuerte(fecha);
        System.out.println("El "+ numeroSuerte+" es tu numero de la suerte supuestamente");

    }

    /**
     * Solicita la fecha al usuario en formato dd-mm-yyyy
     * @return Devuelve la fecha completamente junta. sin guiones ni nada
     */
    public static String solicitarFecha(){
        String fecha = IO.solicitarString("Escriba la fecha de nacimiento en formato (dd-mm-aaaa):",1,11);
        fecha = fecha.trim();
        return fecha.replaceAll("-","");
    }

    /**
     * Calcula el numero de la suerte sumando cada numero de tu fecha de nacimeinto y el resultado sumar cada numero
     * @param fecha Es la fecha sin espacios introducida por el usuario
     * @return Devuelve el supuesto numero de la suerte
     */
    public static Integer calcularNumeroDeLaSuerte(String fecha){
        int totalSuma = 0;
        char[] numero = new char[fecha.length()];
        for (int i = 0; i < fecha.length();i++){
            numero[i] = fecha.charAt(i);
        }
        for (int k = 0; k < numero.length; k++) {
            totalSuma += Character.getNumericValue(numero[k]);
        }
        String result = String.valueOf(totalSuma);
        char primerNum = result.charAt(0);
        char segundoNum = result.charAt(1);
        int numeroSuerte = Character.getNumericValue(primerNum) + Character.getNumericValue(segundoNum);

        return numeroSuerte;

    }
}
