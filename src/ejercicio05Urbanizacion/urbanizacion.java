package ejercicio05;

import java.util.Scanner;

/**
 * Clase urbanizacion.
 * 
 * Objetivo: Registrar el número de casas por manzana en una urbanización.
 * 
 * Contenido temático:
 * - Arreglos bidimensionales: permiten almacenar valores en filas y columnas.
 * - Ciclos for anidados: recorren la estructura para lectura y escritura.
 * 
 * Ejemplo:
 * Ingrese urbanización con 2 manzanas y 3 casas → Resultado: listado de casas.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class urbanizacion {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de manzanas y casas,
     * luego registra los números de cada casa y finalmente muestra
     * el listado completo por manzana.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de manzanas: ");
        int manzanas = teclado.nextInt();

        System.out.print("Ingrese cantidad de casas por manzana: ");
        int casas = teclado.nextInt();

        int[][] urbanizacion = new int[manzanas][casas];

        // Se leen los números de cada casa
        for (int i = 0; i < manzanas; i++) {
            for (int j = 0; j < casas; j++) {
                System.out.print("Ingrese número de casa en manzana " + (i + 1) + ", casa " + (j + 1) + ": ");
                urbanizacion[i][j] = teclado.nextInt();
            }
        }

        // Se muestra el listado de casas por manzana
        System.out.println("Listado de casas por manzana:");
        for (int i = 0; i < manzanas; i++) {
            for (int j = 0; j < casas; j++) {
                System.out.print(urbanizacion[i][j] + " ");
            }
            System.out.println();
        }

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
