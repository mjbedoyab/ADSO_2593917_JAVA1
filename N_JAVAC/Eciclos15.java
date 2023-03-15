import java.util.Scanner;

public class Eciclos15 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => ingrese un numero ");
        int n = entrada.nextInt();
        int factorial=1;

        for (int i = factorial;  i<= n; i++) {
            factorial=factorial*i;
            if (i==n) {
                System.out.print(i+"="+factorial);
            }else{
                System.out.print(i+"x");
            }
        }

    }
    
}
