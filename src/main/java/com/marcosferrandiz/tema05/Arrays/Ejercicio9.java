package com.marcosferrandiz.tema05.Arrays;

import com.marcosferrandiz.tema05.libreria.IO;

import java.util.Arrays;
import java.util.Random;

import static com.marcosferrandiz.tema05.libreria.IO.aleatorio;

public class Ejercicio9 {
    private static boolean relleno = false;
    public static void crearArray(int[] array) {
        if (!relleno) {
            System.out.println("¡Array rellenado!");
            Random random = new Random();
            for (int i = 0; i< array.length; i++){
                array[i] = random.nextInt(1, 10);
            }
            relleno = true;
        }else {
            System.out.println("El Array ya esta rellenado");
        }
    }
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        int[] array = new int[TAMANYO_ARRAY];
        int decision;
        do {
            decision = mostrarMenu();
            switch (decision) {
                case 1 ->  crearArray(array);
                case 2 -> {
                    if (!relleno) {
                        System.err.println("¡Error, array no rellenado!");
                    } else {
                        visualizarArray(array);
                    }
                }
                case 3 -> {
                    if (!relleno) {
                        System.err.println("¡Error, array no rellenado!");
                    } else {
                        visualizarPares(array);
                    }
                }
                case 4 -> {
                    if (!relleno) {
                        System.err.println("¡Error, array no rellenado!");
                    } else {
                        visualizarMultiplos3(array);
                    }
                }
            }

        }while (decision != 0);

    }

    /**
     * Muestra el menú y devuelve la decision
     * @return Devuelve la decision del usuario
     */
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

    /**
     * Devuelve los arrays multiplos del numero indicado
     * @param num Es el array
     * @param multiplo Es el numero indicado para que sea multiplo
     * @return
     */
    public static int[] arrayMultiplosDeNum(int[] num, int multiplo) {
        int tamanyo = multiplosDeNum(num,multiplo);
        int[] multiplos = new int[tamanyo];
        int contador = 0;
        for (int numero : num) {
            if (numero % multiplo == 0) {
                multiplos[contador] = numero;
                contador++;
            }
        }
        return multiplos;
    }

    /**
     * Devuelve los multiplos de un numero
     * @param num Es el array
     * @param multiplo Es el numero al que tiene que ser multiplo
     * @return
     */
    public static int multiplosDeNum(int[] num, int multiplo) {
        int conta = 0;
        for (int numero : num) {
            if (numero % multiplo == 0) {
                conta++;
            }
        }
        return conta;
    }

    /**
     * Muestra los valores del array
     * @param array Es el array que quieres mostrar
     */
    public static void visualizarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Muestra los arrays pares
     * @param array Es el array que quieres mostrar
     */
    public static void visualizarPares(int[] array) {
        int[] arrayPares = arrayMultiplosDeNum(array,2);
        System.out.println(Arrays.toString(arrayPares));
    }

    /**
     * Muestra los arrays multilplos de 3
     * @param array El array que quieres que sea multiplos
     */
    public static void visualizarMultiplos3(int[] array) {
        int[] arr = arrayMultiplosDeNum(array,3);
        System.out.println(Arrays.toString(arr));
    }
}
