import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite el primer numero: ");
        int primernumero = entrada.nextInt();
        System.out.print("digite el segundo numero: ");
        int segundonumero = entrada.nextInt();
        System.out.print("digite el tercer numero: ");
        int tercernumero = entrada.nextInt();

        if (primernumero>segundonumero && segundonumero<tercernumero && primernumero>3) {
            System.out.println("este es el mayor numero: " + primernumero);
            System.out.println("este es el menor numero: " + segundonumero);

        } else if (primernumero<segundonumero && segundonumero<tercernumero && tercernumero>primernumero) {
            System.out.println("este es el mayor numero: " + tercernumero);
            System.out.println("este es el menor: " + primernumero);

        } else if (primernumero<segundonumero && segundonumero>tercernumero && tercernumero>primernumero) {
            System.out.println("este es el mayor numero: " + segundonumero);
            System.out.println("este es el menor: " + primernumero);

        } else if (primernumero>segundonumero && segundonumero<tercernumero && tercernumero>segundonumero) {
            System.out.println("este es el mayor numero: " + tercernumero);
            System.out.println("este es el menor: " + segundonumero);

        } else if (primernumero<segundonumero && segundonumero>tercernumero && tercernumero<primernumero) {
            System.out.println("este es el mayor numero: " + segundonumero);
            System.out.println("este es el menor: " + tercernumero);
        }

    }
    
}
