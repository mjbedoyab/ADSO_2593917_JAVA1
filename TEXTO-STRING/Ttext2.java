import java.util.Scanner;

public class Ttext2 {

    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = letra.nextLine();
        System.out.print("Ingrese un numero: ");
        int numero = num.nextInt();

        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            int indice = (i+1) - numero;
            if (indice < 0) {
                indice = frase.length() + indice;
            }

            resultado += frase.charAt(indice);
        }

        System.out.println("Resultado: " + resultado);

        letra.close();
    }

}

