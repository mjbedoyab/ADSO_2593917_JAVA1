import java.util.Scanner;

public class Textt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo;
        int longitud;

        System.out.print("Ingresa la longitud del arreglo: ");
        longitud = sc.nextInt();
        arreglo = new int[longitud];

        // Llenar el arreglo con los datos ingresados por el usuario
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingresa el valor para la posicion " + i + ": ");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Ingresa la posición a partir de la cual deseas imprimir en sentido antihorario: ");
        int posicion = sc.nextInt();

        // Imprimir el arreglo original
        System.out.print("Arreglo original: [");
        for (int i = 0; i < longitud; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arreglo[i]);
        }
        System.out.println("]");

        // Imprimir el arreglo en sentido antihorario
        System.out.print("Sentido antihorario: ");
        for (int i = posicion; i < longitud; i++) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = posicion - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
