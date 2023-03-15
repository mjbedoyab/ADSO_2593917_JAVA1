import java.util.Scanner;

public class Text12 {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        System.out.print(" => defina los tamaños del arreglo : ");
        int tamo = num.nextInt();

        int arreglo_1 [] = new int [tamo];
        int arreglo_2 [] = new int [tamo];
        int arreglo_3 [] = new int [tamo*2];
        int acum = 0;

        for (int i = 0; i < tamo; i++) {
            System.out.println(" arreglo 1 : ");
            int uno = num.nextInt();
            arreglo_1[i]=uno;

        }
        for (int i = 0; i < tamo; i++) {
            System.out.println(" arreglo 2 : ");
            int dos = num.nextInt();
            arreglo_2[i]=dos;

        }
        for (int i = 0; i < arreglo_1.length; i++) {
            System.out.print("["+arreglo_1[i]+"]");
        }
        System.out.println();

        for (int i = 0; i < arreglo_2.length; i++) {
            System.out.print("["+arreglo_2[i]+"]");
        }
        System.out.println();

        
        for (int i = 0; i < tamo; i++) {
            arreglo_3[acum]=arreglo_1[i];
            arreglo_3[acum+1] = arreglo_2[i];
            acum += 2;
        }
        for (int i = 0; i < arreglo_3.length; i++) {
            System.out.print("["+arreglo_3[i]+"]");
        }
    }
}
