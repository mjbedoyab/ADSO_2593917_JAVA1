import java.util.Scanner;

public class Ttext3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese las dos palabras
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine();

        // Crear la palabra compuesta intercalando los caracteres de las dos palabras
        StringBuilder palabraCompuesta = new StringBuilder();

        int longitudMaxima = Math.max(palabra1.length(), palabra2.length());

        for (int i = 0; i < longitudMaxima; i++) {
            if (i < palabra1.length()) {
                palabraCompuesta.append(palabra1.charAt(i));
            }
            if (i < palabra2.length()) {
                palabraCompuesta.append(palabra2.charAt(i));
            }
        }

        // Mostrar el resultado en pantalla
        System.out.println("La palabra compuesta es: " + palabraCompuesta.toString());
    }
}
