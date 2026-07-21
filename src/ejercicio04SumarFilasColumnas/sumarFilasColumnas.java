package ejercicio04;

import java.util.Scanner;

/**
 * Clase sumarFilasColumnas.
 * 
 * Objetivo: Calcular la suma de cada fila y columna de una matriz.
 * 
 * Contenido temático:
 * - Arreglos bidimensionales: permiten almacenar valores en filas y columnas.
 * - Ciclos for anidados: recorren la matriz para lectura y cálculo.
 * - Acumuladores: suman los valores de cada fila y columna.
 * 
 * Ejemplo:
 * Ingrese matriz 2x2 → Resultado: suma de filas y columnas.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class sumarFilasColumnas {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario las dimensiones de la matriz,
     * luego lee sus elementos y finalmente calcula la suma de cada
     * fila y de cada columna.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese filas: ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Se leen los elementos de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Se calcula y muestra la suma de cada fila
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }

        // Se calcula y muestra la suma de cada columna
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma columna " + j + ": " + sumaColumna);
        }

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
