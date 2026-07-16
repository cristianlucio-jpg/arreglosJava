package ejercicio01;

import java.util.Scanner;

/**
 * Clase invertirVector.
 * 
 * Objetivo: Invertir los elementos de un vector.
 * 
 * Contenido temático:
 * - Arreglos unidimensionales: permiten almacenar múltiples valores.
 * - Ciclos for: recorren los elementos para lectura y escritura.
 * 
 * Ejemplo:
 * Ingrese: [1, 2, 3] → Resultado: [3, 2, 1]
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class invertirVector {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de elementos,
     * luego lee cada uno de ellos y finalmente muestra el vector
     * en orden inverso.
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

        // Se muestran los elementos en orden inverso
        System.out.println("Vector invertido:");
        for (int i = cantidadElementos - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
