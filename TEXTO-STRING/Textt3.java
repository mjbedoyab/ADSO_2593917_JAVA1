import java.util.Scanner;

public class Textt3 {
  public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int)(Math.random()*100);
            boolean valido= true;
            for (int h=0;h<arreglo.length;h++ ) {
                if (arreglo[h] == arreglo.length) {
                    valido = false;
                }
            }
            if (valido) {
                arreglo[i]=arreglo.length;
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();
    }  
}
