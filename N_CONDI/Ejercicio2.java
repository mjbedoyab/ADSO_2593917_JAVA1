import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingre un numero de tres digitos: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("es par");
        }else {
            System.out.println("es impar");
        }
    }
}
