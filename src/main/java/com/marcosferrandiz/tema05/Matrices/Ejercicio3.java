package com.marcosferrandiz.tema05.Matrices;

import com.marcosferrandiz.tema05.libreria.IO;
import com.marcosferrandiz.tema05.libreria.matriz;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Ficha{
        O,X
    }
    public enum Jugador{
        PLAYER1, PLAYER2
    }
    private static Ficha[][] tablero;
    private static Jugador turnoActual;
    public static final int FILAS = 3;
    public static final int COLUMNAS = 3;
    private static Scanner scanner = new Scanner(System.in);

    private static void reset(){
        Random random = new Random();
        tablero = new Ficha[FILAS][COLUMNAS];
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }
        }

        Jugador[] valoresJugador = Jugador.values();
        turnoActual = valoresJugador[random.nextInt(0, valoresJugador.length)];
    }

    private static void play(){
        boolean valido;
        char fila = ' ', columna = ' ';
        System.out.println(tableroToString(tablero));
        System.out.println("Turno "+ turnoActual + "(" + getFichaJugador(turnoActual) + ")" );
        do {
            System.out.println("Jugada?");
            String posicion = scanner.nextLine().toUpperCase();
            valido = posicion.length() == 2;
            if (!valido){
                System.err.println("La longitud debe ser de 2 caracteres");
                continue;
            }
            fila = posicion.charAt(0);
            columna = posicion.charAt(1);
            valido = (fila >= 'A' && fila<= 'C') &&
                    (columna >= '1' && columna<= '3');
            if (!valido){
                System.err.println("Debe indicar la fila (letra) y la columna (número). Ejemplo: A2");
                continue;
            }
            valido = esJugadaValida(fila, Character.getNumericValue(columna));
            if (!valido){
                System.err.println("Esa posicion ya está ocupada");
            }
        }while (!valido);
        tablero[getFilaReal(fila)][getColumnaReal(columna)] = getFichaJugador(turnoActual);

    }

    private static int getFilaReal(char fila){
        return fila - 'A';
    }
    private static int getColumnaReal(int collumna){
        return collumna-1;
    }

    private static boolean esJugadaValida(char fila, int columna){
        int filaReal = fila - 'A';
        int columnaReal = columna - 1;
        return tablero[filaReal][columnaReal] == null;
    }

    private static Ficha getFichaJugador (Jugador jugador){
        Ficha[] fichas = Ficha.values();
        return  fichas[jugador.ordinal()];
    }

    private static String tableroToString(Ficha[][] tablero){
        StringBuilder sb = new StringBuilder();
        //sb.append(String.format("%4s", ))
        for (int i = 0; i < tablero.length ; i++) {
            sb.append("|---|---|---|\n");
            for (int j = 0; j < tablero[i].length ; j++) {
                sb.append("| ").append(tablero[i][j] == null ? " ": tablero[i][j]).append(" ");
            }
            sb.append("|\n");
        }
        sb.append("|---|---|---|\n");
        return sb.toString();
    }


    public static void main(String[] args) {
        reset();
        play();
        play();
    }
}
