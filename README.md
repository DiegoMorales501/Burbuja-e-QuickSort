# Ordenamiento Burbuja en Java

En este proyecto implementé el método de ordenamiento **Burbuja (Bubble Sort)** en Java. Es parte de mi práctica de métodos de ordenamiento.

## Archivos

- `Burbuja.java`: aquí está el algoritmo (`ordenar`) y un método para imprimir el arreglo (`imprimirArreglo`).
- `Mainburbuja.java`: la clase principal donde pruebo el algoritmo con un arreglo de ejemplo.

Ambos están dentro del paquete `Metodos_de_ordenamientos`, así que la estructura de carpetas queda así:

```
src/
└── Metodos_de_ordenamientos/
    ├── Burbuja.java
    └── Mainburbuja.java
```

## ¿Cómo funciona?

El algoritmo compara cada elemento con el que está a su lado y los intercambia si están en el orden incorrecto. Así, en cada pasada el número más grande va "subiendo" hasta el final del arreglo, como una burbuja.

Además le agregué una variable `intercambiado`: si en una pasada completa no se hizo ningún cambio, significa que el arreglo ya está ordenado y el programa se detiene para no hacer pasadas de más.

## Complejidad

- Mejor caso (ya ordenado): O(n)
- Caso promedio y peor caso: O(n²)
- Espacio: O(1), porque ordena el mismo arreglo sin usar otro

## Cómo ejecutarlo

### Requisitos

Necesito tener instalado el **JDK** (Java Development Kit), versión 8 o superior. Para comprobar que lo tengo, abro una terminal y escribo:

```bash
java -version
javac -version
```

Si los dos comandos muestran una versión, ya está listo.

### Opción 1: desde un IDE (IntelliJ IDEA)

1. Abrir el proyecto en IntelliJ (`File > Open` y elegir la carpeta del proyecto).
2. Verificar que `Burbuja.java` y `Mainburbuja.java` estén dentro de `src/Metodos_de_ordenamientos/`.
3. Abrir el archivo `Mainburbuja.java`.
4. Dar clic en el triángulo verde que aparece junto a `public static void main` y elegir **Run 'Mainburbuja.main()'** (o usar el atajo `Shift + F10`).
5. El resultado aparece en la consola de la parte de abajo.

### Opción 2: desde la terminal

1. Abrir la terminal y entrar a la carpeta `src` del proyecto (la que contiene la carpeta `Metodos_de_ordenamientos`):

   ```bash
   cd ruta/del/proyecto/src
   ```

2. Compilar los archivos `.java`:

   ```bash
   javac Metodos_de_ordenamientos/*.java
   ```

   Esto genera los archivos `.class` dentro de la misma carpeta.

3. Ejecutar la clase principal, usando el nombre del paquete seguido del nombre de la clase (sin `.java`):

   ```bash
   java Metodos_de_ordenamientos.Mainburbuja
   ```

**Nota:** hay que ejecutarlo desde la carpeta `src` y no desde dentro de `Metodos_de_ordenamientos`; si no, Java no encuentra el paquete y marca error (`Could not find or load main class`).

## Salida esperada

El arreglo de prueba es `{6, 1, 5, 8, 3, 2, 7, 4}` y al ejecutarlo se imprime:

```
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado:
[1, 2, 3, 4, 5, 6, 7, 8]
```

Si el programa termina con `Process finished with exit code 0`, significa que se ejecutó sin errores.
