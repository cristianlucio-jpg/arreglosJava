package ejercicio02;

import java.util.Scanner;

/**
 * Clase mayorElementoVector.
 * 
 * Objetivo: Encontrar el mayor elemento de un vector.
 * 
 * Contenido temático:
 * - Arreglos unidimensionales: permiten almacenar múltiples valores.
 * - Ciclos for: recorren los elementos para lectura y comparación.
 * - Comparaciones: determinan el mayor valor.
 * 
 * Ejemplo:
 * Ingrese: [4, 9, 2] → Resultado: 9
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class mayorElementoVector {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de elementos,
     * luego lee cada uno de ellos, recorre el vector y determina
     * cuál es el mayor valor ingresado.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidadElementos = teclado.nextInt();

        int[] vector = new int[cantidadElementos];

        // Se leen los elementos y se almacenan en el vector
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }

        // Se inicializa el mayor con el primer elemento
        int mayor = vector[0];

        // Se recorre el vector comparando cada elemento
        for (int i = 1; i < cantidadElementos; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }

        // Se muestra el resultado final
        System.out.println("El mayor elemento es: " + mayor);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}


