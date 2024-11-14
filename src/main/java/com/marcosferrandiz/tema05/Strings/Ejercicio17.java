package com.marcosferrandiz.tema05.Strings;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio17 {
    public static void main(String[] args) {
        String nif = IO.solicitarString("Ingrese su NIF",1,9);
        boolean vali = comprobarNIF(nif.trim().toUpperCase());
        String result = vali ? "El NIF introducido esta correctamente" : "El NIF introducido no es correcto";
        System.out.println(result);
    }

    /**
     * Comprueba que el NIF sea correcto, mirando que la letra indicada este bien
     * @param nif El NIF introducido por el usuario con la letra
     * @return Devuelve en NIF con la letra correcta
     */
    public static boolean comprobarNIF(String nif) {
        String dni = nif.substring(0, nif.length()-1);
        int dniSinLetra = Integer.parseInt(dni);
        return nif.equals(Ejercicio16.calcularNIF(dniSinLetra));
    }
}
