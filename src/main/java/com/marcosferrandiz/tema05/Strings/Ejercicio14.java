package com.marcosferrandiz.tema05.Strings;

import java.util.Scanner;

public class Ejercicio14 {
    /**
     * Hace una cuenta progresiva hasta 9, y cuando llega a 9 pasa a 0 y suma 1 mas al suigiente, y vuelve a repetir el proeso, aparte tambien sustituye el numero indicado por el usuario por el acracter que quiera
     * @param num El numero introducido por el usuario que quiera sustituir
     * @param car La letra por el que quiere sustituir el numero indiado
     */
    public static void contador4Digitos(int num, char car){
        StringBuilder sb = new StringBuilder();
        for (int cuarto = 0; cuarto <= 9; cuarto++) {
            for (int tercero = 0; tercero <= 9; tercero++) {
                for (int segundo = 0; segundo <= 9; segundo++) {
                    for (int primero = 0; primero <= 9; primero++) {

                        sb.append(cuarto).append("|").append(tercero).append("|").append(segundo).append("|").append(primero).append("|");
                        System.out.printf("%s\n", sb.toString().replace(String.valueOf(num),String.valueOf(car)));
                        sb.setLength(0);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el numero que quiera sustituir [0-9]");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Indique el carater por el que lo quieras sustituir");
        char car = input.next().charAt(0);
        contador4Digitos(num, car);

    }
}
