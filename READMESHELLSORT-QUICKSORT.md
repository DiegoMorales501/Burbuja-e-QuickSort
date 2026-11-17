#  ShellSort y QuickSort en Java

Dos algoritmos de ordenamiento hechos en Java: **Shell Sort** y **Quick Sort**. Cada uno tiene su clase y un `Main` para probarlo.

##  Archivos

```
src/Metodos_de_ordenamientos/
├── ShellSort.java
├── MainShellSort.java
├── QuickSort.java
└── MainQuickSort.java
```

##  Qué necesitas

- **Java JDK** (versión 11 o más nueva)
- **Git**

## cómo usarlo

**1. Clona el repo**
```bash
git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git
cd TU_REPOSITORIO/src
```

**2. Compila**
```bash
javac Metodos_de_ordenamientos/*.java
```

**3. Ejecuta el que quieras**
```bash
java Metodos_de_ordenamientos.MainShellSort
java Metodos_de_ordenamientos.MainQuickSort
```

>  Tienes que estar dentro de la carpeta `src`, si no Java no encuentra las clases.

##  Qué deberías ver

```
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado:
[1, 2, 3, 4, 5, 6, 7, 8]
```

## Cómo funcionan

- **Shell Sort:** como el ordenamiento por inserción, pero comparando elementos que están lejos entre sí. Empieza con saltos grandes y los va achicando hasta 1.
- **Quick Sort:** escoge un pivote, manda los menores a un lado y los mayores al otro, y repite lo mismo con cada lado.

## 🧪 Prueba con tus números

Cambia el arreglo en `MainShellSort.java` o `MainQuickSort.java`, vuelve a compilar y ejecuta:

```java
int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};
``