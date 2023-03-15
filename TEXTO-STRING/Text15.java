import java.util.Scanner;

public class Text15 {
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);

        System.out.print(" => defina tamaño del arreglo ");
        int n = numero.nextInt();

        String arreglo [] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+" ingrese palbras: ");
            String palab = letra.nextLine();
            arreglo[i]=palab;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();

        System.out.print("Ingrese la posición del elemento que desea eliminar: ");
        int posicion = numero.nextInt();
        // Eliminar el elemento de la posición indicada
        for (int i = posicion; i < n-1; i++) {
            arreglo[i] = arreglo[i+1];
        }
        arreglo[n-1] = "";
        
        // Mostrar el arreglo resultante
        System.out.println("Arreglo resultante:");
        for (int i = 0; i < n; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
    }
}
