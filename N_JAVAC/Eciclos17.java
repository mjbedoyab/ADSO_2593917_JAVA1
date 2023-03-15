import java.util.Scanner;

public class Eciclos17 {
    public static void main(String[] args) {
        
        Scanner  entrada=new Scanner(System.in);

        System.out.println(" => ingrse altura ");
        int al = entrada.nextInt();
        int a = (al+1)/2;

        for (int i = 0; i <= a; i++) {
            for (int k = a-i; k > 0; k--) {
                System.out.print(" ");  
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" x"); 
            }
            System.out.println(""); 
        }
        for (int i = 0; i <= a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");  
            }
            for (int k = a-i-1; k > 0; k--) {
                System.out.print(" x"); 
            }
            System.out.println(""); 
        }

    }
    
}
