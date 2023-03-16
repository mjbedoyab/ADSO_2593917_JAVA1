import java.util.Scanner;

public class Textt5 {
    public static void main(String[] args) {
        
        Scanner margen = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int numPersonas = num.nextInt();

        String[] nombres = new String[numPersonas];
        String[] generos = new String[numPersonas];

        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = margen.nextLine();
      
            System.out.print("Ingrese el género de la persona " + (i + 1) + " (Hombre/Mujer): ");
            generos[i] = margen.nextLine();
        }
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("[ " + nombres[i] + " -> " + generos[i] + " ]");
            
        }
    }
}
