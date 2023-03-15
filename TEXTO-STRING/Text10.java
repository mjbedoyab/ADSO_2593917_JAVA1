import java.util.Scanner;

public class Text10 {
    public static void main(String[] args) {
        
        Scanner digito = new Scanner(System.in);

        System.out.print("Introduce el tamaño del arreglo: ");
        int ingre = digito.nextInt();

        int arreglo [] = new int [ingre];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" => ");
            int intro = digito.nextInt();
            arreglo[i]=intro;

        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();

        System.out.print("Introduce los movimientos: ");
        int moves = digito.nextInt();
        for (int i = 1; i <= moves; i++) {
            int temp = arreglo[0];
            for (int j = 1; j < ingre; j++) {
                arreglo[j - 1] = arreglo[j];
            }
            arreglo[ingre - 1] = temp;
            System.out.print("Movimiento " + i + ": { ");
            for (int j = 0; j < ingre; j++) {
                System.out.print(arreglo[j]);
                if (j != ingre - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");
        }
    }
}
