import java.util.Scanner;

public class Text9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Pedir al usuario la longitud del arreglo
        System.out.print("Ingrese la longitud del arreglo: ");
        int n = sc.nextInt();

        // Paso 2: Crear un arreglo de tamaño n
        int[] arreglo = new int[n];

        // Paso 3: Pedir al usuario que ingrese los valores del arreglo
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }

        // Paso 4: Imprimir el arreglo original
        System.out.print("Arreglo Original: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("}");

        // Paso 5: Determinar los números primos y no primos
        int[] primos = new int[n];
        int[] noPrimos = new int[n];
        int cantPrimos = 0, cantNoPrimos = 0;
        for (int i = 0; i < n; i++) {
            if (esPrimo(arreglo[i])) {
                primos[cantPrimos] = arreglo[i];
                cantPrimos++;
            } else {
                noPrimos[cantNoPrimos] = arreglo[i];
                cantNoPrimos++;
            }
        }

        // Paso 6: Imprimir los arreglos de primos y no primos
        System.out.print("Arreglo Primos: { ");
        for (int i = 0; i < cantPrimos; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println("}- Longitud: " + cantPrimos);

        System.out.print("Arreglo No Primos: { ");
        for (int i = 0; i < cantNoPrimos; i++) {
            System.out.print(noPrimos[i] + " ");
        }
        System.out.println("}- Longitud: " + cantNoPrimos);
    }

    // Método para determinar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

