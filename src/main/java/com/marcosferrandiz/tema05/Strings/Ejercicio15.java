package com.marcosferrandiz.tema05.Strings;

import java.util.Scanner;

public class Ejercicio15 {
    /**
     * Muestra por pantalla un caracter seleccionado con el alto y el ancho seleccionado
     * @param ancho El ancho que ha elejido el usuario
     * @param alto El alto que ha elejido el usuario
     * @param caracter El caracter elejido por el usuario
     */
    public static void hacerRectangulo(int ancho, int alto, char caracter){
        for (int i = 0; i < alto;i++){
            for (int j = 0; j < ancho; j++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el ancho deseado");
        int ancho = Integer.parseInt(input.nextLine());
        System.out.println("Introduzca el alto deseado");
        int alto = Integer.parseInt(input.nextLine());
        System.out.println("Introduzca el caracter deseado para dibujar");
        char caracter = input.next().charAt(0);
        hacerRectangulo(ancho,alto,caracter);
        input.close();
    }
}
