package Metodos_de_ordenamientos;

import java.util.Arrays;

public class Mainburbuja {

    // Muestra el arreglo ya ordenado
    public static void main(String[] args) {

        // Arreglo de prueba desordenado
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        // Muestra el arreglo antes de ordenar
        System.out.println("Arreglo original:");
        Burbuja.imprimirArreglo(arreglo);

        // Ordena el arreglo con el método burbuja
        Burbuja.ordenar(arreglo);

        // Muestra el arreglo ya ordenado
        System.out.println("Arreglo ordenado:");
        Burbuja.imprimirArreglo(arreglo);
    }
}
