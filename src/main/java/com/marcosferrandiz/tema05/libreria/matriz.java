package com.marcosferrandiz.tema05.libreria;

public class matriz {
    public static void main(String[] args) {
        double[][] matriz = crearMatrizAleatoria(3,3,0,10);
        System.out.println(matrizToString(matriz,4,5));
    }
    public static double[][] crearMatrizAleatoria(int filas, int columnas, double valorMinimo, double valorMaximo){
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j< matriz[i].length; j++){
                matriz[i][j] = IO.aleatorio(valorMinimo,valorMaximo);
            }
        }
        return matriz;
    }

    public static String matrizToString(double[][] matriz, int decimales, int padding){
        int anchoColumna = determinarLongitudMaxima(matriz,decimales);
        String formato = "%"+ anchoColumna +"." + decimales+"f";
        String formatoPadding = "%" + (anchoColumna + padding)+ "s";
        StringBuilder sb = new StringBuilder();
        for (double[] fila : matriz){
            for (double valor : fila){
                sb.append(String.format( formatoPadding, String.format(formato, valor)));
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static int determinarLongitudMaxima(double[][] matriz, int decimales){
        int longitudMaxima = 0;
        for (double[] fila : matriz){
            int longitud = IO.determinarLongitudMaxima(fila,decimales);
            if (longitud > longitudMaxima){
                longitudMaxima = longitud;
            }
        }
        return longitudMaxima;
    }
}
