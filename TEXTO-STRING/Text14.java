import java.util.Scanner;

public class Text14 {
    public static void main(String[] args) {
        
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.print(" => defina tamaño del arreglo: ");
        int max = num.nextInt();

        String arreglo [] = new String [max];

        for (int i = 0; i < max; i++) {
            System.out.print(" ingrese palabras:  ");
            String palabra = letra.nextLine();
            arreglo[i]=palabra;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();

        System.out.print("Ingrese una palabra a buscar: ");
        String buscar = letra.nextLine();
        System.out.println("Encontradas:");
        for (int i = 0; i < max; i++) {
            if (arreglo[i].toLowerCase().contains(buscar.toLowerCase())) {
                System.out.println("-> Posicion " + i + ": " + arreglo[i]);
            }
        }
    }
}
