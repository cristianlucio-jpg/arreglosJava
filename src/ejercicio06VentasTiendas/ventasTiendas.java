package ejercicio06;

import java.util.Scanner;

/**
 * Clase ventasTiendas.
 * 
 * Objetivo: Registrar ventas de varias tiendas y calcular el total.
 * 
 * Contenido temático:
 * - Arreglos bidimensionales: permiten almacenar ventas por tienda y día.
 * - Ciclos for anidados: recorren la matriz para lectura y acumulación.
 * - Acumuladores: suman los valores para obtener el total.
 * 
 * Ejemplo:
 * Ingrese ventas de 2 tiendas en 3 días → Resultado: total de ventas.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class ventasTiendas {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de tiendas y días,
     * luego registra las ventas y finalmente calcula el total acumulado.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de tiendas: ");
        int tiendas = teclado.nextInt();

        System.out.print("Ingrese cantidad de días: ");
        int dias = teclado.nextInt();

        double[][] ventas = new double[tiendas][dias];

        // Se leen las ventas por tienda y día
        for (int i = 0; i < tiendas; i++) {
            for (int j = 0; j < dias; j++) {
                System.out.print("Ingrese venta de tienda " + (i + 1) + " en día " + (j + 1) + ": ");
                ventas[i][j] = teclado.nextDouble();
            }
        }

        // Se calcula el total de ventas
        double totalVentas = 0;
        for (int i = 0; i < tiendas; i++) {
            for (int j = 0; j < dias; j++) {
                totalVentas += ventas[i][j];
            }
        }

        // Se muestra el resultado final
        System.out.println("El total de ventas es: $" + totalVentas);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}

