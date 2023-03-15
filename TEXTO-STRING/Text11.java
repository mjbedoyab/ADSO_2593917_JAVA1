import java.util.Arrays;
import java.util.Scanner;

public class Text11 {
    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);

        System.out.print(" => defina los tamaños del arreglo : ");
        int tamo = numeros.nextInt();

        int arreglo_1 [] = new int [tamo];
        int arreglo_2 [] = new int [tamo];

        for (int i = 0; i < tamo; i++) {
            System.out.println(" arreglo 1 : ");
            int uno = numeros.nextInt();
            arreglo_1[i]=uno;

        }
        for (int i = 0; i < tamo; i++) {
            System.out.println(" arreglo 2 : ");
            int dos = numeros.nextInt();
            arreglo_2[i]=dos;

        }
        for (int i = 0; i < tamo; i++) {
            System.out.print("["+arreglo_1[i]+"]");
            
        }
        System.out.println();
        for (int i = 0; i < tamo; i++) {
            System.out.print("["+arreglo_2[i]+"]");

        }
        System.out.println();
        Arrays.sort(arreglo_1);
        Arrays.sort(arreglo_2);

        if (Arrays.equals(arreglo_1, arreglo_2)) {
            System.out.println("Los arreglos son equivalentes.");
        } else {
            System.out.println("Los arreglos son diferentes.");
        }
    }
}
