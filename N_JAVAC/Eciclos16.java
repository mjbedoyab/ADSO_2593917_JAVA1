import java.util.Scanner;

public class Eciclos16 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        System.out.print(" => ingrese el numero ");
        int n = entrada.nextInt();

        System.out.print(" => ingrese el numero ");
        int x = entrada.nextInt();

        for (int i = n; i <= x; i++) {
            int factorial=1;
            System.out.println(i+"("+i+"!);");
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                factorial=factorial*j;
                if (j==i) {
                    System.out.print(j+"="+factorial);
                }else{
                    System.out.print(j+"x");
                }
                
            }
            System.out.println();
            
        }

    }
    
}
