import java.util.Scanner;

public class Textt1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => ingrese un numero: ");
        int num = entrada.nextInt();

        int impares [] = new int [num];

        for (int i = 0; i < impares.length; i++) {
            impares[i] = 2 * i + 1;
        }
        System.out.println("El arreglo de números impares es:");

        for (int i = 0; i < impares.length; i++) {
            System.out.print("["+impares[i]+"]");
        }
        System.out.println();
    }
}
