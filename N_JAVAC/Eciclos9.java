import java.util.Scanner;

public class Eciclos9 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);

        System.out.println(" => digite el numero");
        int numero= entrada.nextInt();

        int contador=0;
        for (int i = 1; i <= numero; i++) {
            if ((numero%i)==0) {
                contador++;
            }
            
        }
        if (contador <= 2) {
            System.out.println(" el numero es primo ");
        }else{
            System.out.println(" el numero no es primo ");
        }


            
        
    }
    
}
