package Metodos_de_ordenamientos;

// Ordenamiento Burbuja: compara pares adyacentes y los intercambia si están desordenados
public class Burbuja {

    // Ordena el arreglo de forma ascendente (modifica el mismo arreglo)
    public static void ordenar(int[] arr){
        int n = arr.length;
        boolean intercambiado;

        // Cada pasada deja el mayor elemento restante al final
        for(int i = 0; i < n - 1; i++){
           intercambiado = false;

            // n - i - 1 evita revisar la parte que ya está ordenada
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j +1 ]){

                    // Intercambia los dos elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    intercambiado = true;
                }
            }

            // Si no hubo intercambios, ya está ordenado
            if(!intercambiado){
                break;
            }
        }
    }

    // Imprime el arreglo con el formato [a, b, c]
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
