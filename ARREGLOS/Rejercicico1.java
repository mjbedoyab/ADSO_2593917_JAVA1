import java.util.Scanner;

public class Rejercicico1 {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.print(" => ingrese el numero : ");
        int n = entrada.nextInt();

        int [] arreglo =new int [n];

        for (int i = 0; i < arreglo.length; i++) {

            int  m = i+1;
            arreglo[i] = (m*2)-1;
            
        }
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("["+arreglo[i]+"]");
        }

    }
    
}
