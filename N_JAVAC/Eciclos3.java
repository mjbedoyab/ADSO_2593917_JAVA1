import java.util.Scanner;

public class Eciclos3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => ALTURA 1 ");
        System.out.println(" => ALTURA 2 ");
        System.out.println(" => ALTURA 3 ");
        System.out.println(" => ALTURA 4 ");
        System.out.println(" => ALTURA 5 ");
        System.out.println(" => ALTURA 6 ");
        System.out.println(" => ALTURA 7 ");

        System.out.println(" => ingrse altura ");
        int a = entrada.nextInt();

        for (int i = 0; i <= a; i++) {
            int alt= (i*2) -1;
            int espc =(a-i);

            for (int  j = 0 ; j < alt ; j++ ) {
                System.out.print("x");
                
            }
            System.out.println();
            for (int m = 1; m < espc; m++) {
                System.out.print(" ");
                
            }
            
        }

    }
    
}
