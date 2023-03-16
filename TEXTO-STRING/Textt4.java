import java.util.Arrays;
import java.util.Scanner;

public class Textt4 {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        
        System.out.print("Ingrese un numero para determinar la longitud del arreglo: ");
        int n = num.nextInt();

        
        String[] nombres = new String[n];

        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre para el indice " + i + ": ");
            nombres[i] = letra.next();
        }

        // Imprimir el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(nombres));

        // Ordenar el arreglo alfabéticamente
        Arrays.sort(nombres);

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado alfabeticamente: " + Arrays.toString(nombres));
    }
}

