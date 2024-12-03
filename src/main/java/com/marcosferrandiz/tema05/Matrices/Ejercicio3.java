package com.marcosferrandiz.tema05.Matrices;

import com.marcosferrandiz.tema05.libreria.matriz;

public class Ejercicio3 {
    enum Ficha{
        O,X, NADA
    }
    enum Jugador{
        PLAYER1, PLAYER2
    }
    public static Ficha[][] tablero;
    public static Jugador turnoActual;

    public static void reset(){
        turnoActual = Jugador.PLAYER1;
        tablero = new Ficha[5][5];
        for (int i = 0; i <= tablero.length ; i = i + 2) {
            for (int j = 0; j <= tablero[i].length; j = j + 2) {
                tablero[i][j] = Ficha.valueOf(" ");
            }
        }
        for (int i = 1; i <= tablero.length ; i = i + 2) {
            for (int j = 1; j <= tablero[i].length; j = j + 2) {
                tablero[i][j] = Ficha.valueOf("|");
            }
        }

        for (int i = 1; i <= tablero.length ; i = i + 2) {
            for (int j = 1; j <= tablero[i].length; j = j + 2) {
                System.out.println(tablero[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        reset();
    }
}
