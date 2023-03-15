import java.util.Scanner;

public class Eciclos6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => ingrese el numero ");
        int n = entrada.nextInt();

        int fig_1 =0;
        int fig_2 =1;
        int suma=0;

        for (int i =0 ; i < n; i++) {

            if (i <= 1) {
                
            }else{
                suma=fig_1+fig_2;
                fig_1=fig_2;
                fig_2=suma;

                
            }
   
        }
        System.out.print("fibonari es:  " +suma);
    }
    
}
