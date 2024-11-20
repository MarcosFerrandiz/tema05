package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

public class Ejercicio9 {
    public static void main(String[] args) {
        int decision = mostrarMenu();

    }
    public static int mostrarMenu(){
        System.out.println("==============");
        System.out.println("1.-Rellenar array.");
        System.out.println("2.-Visualizar contenido del array");
        System.out.println("3.-Visualizar contenido par");
        System.out.println("4.-Visualizar contenido múltiplo de 3");
        System.out.println("0.-Salir del menú");
        int seleccion = IO.solicitarEntero("Selecciona una opción:",0,4);
        return seleccion;
    }
}
