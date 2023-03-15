import java.util.Scanner;

public class Ciclosmientras {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int contador=9;

       // while (contador >= 0) {
            int resultado = 5 *contador;
            System.out.println("5 x " +contador+"="+resultado);
            contador--;
            
       // }//
        for (int i =10 ; i >=0; i--) {
            int resultado = 5 * i;
            System.out.println("5 x " +i+"="+resultado);
            
        }
    }
    
}
