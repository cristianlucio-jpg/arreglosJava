package ejercicio03;

import java.util.Scanner;

/**
 * Clase matrizDiagonal.
 * 
 * Objetivo: Mostrar la diagonal principal de una matriz cuadrada.
 * 
 * Contenido temático:
 * - Arreglos bidimensionales: permiten almacenar valores en filas y columnas.
 * - Ciclos for anidados: recorren la matriz para lectura de datos.
 * - Selección de elementos: acceso a la diagonal principal mediante índices iguales.
 * 
 * Ejemplo:
 * Ingrese matriz 3x3 → Resultado: elementos [0][0], [1][1], [2][2].
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class matrizDiagonal {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario el tamaño de la matriz cuadrada,
     * luego lee sus elementos y finalmente muestra la diagonal principal.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamaño = teclado.nextInt();

        int[][] matriz = new int[tamaño][tamaño];

        // Se leen los elementos de la matriz
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("Ingrese elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Se muestra la diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
