import java.util.Scanner;

public class Eciclos13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int i=1;

        System.out.println(" ingrese un digito ");
        int n=entrada.nextInt();

        while (i<=n) {
            int contador =0;
            int j=1;
            int aleatorio=(int)(Math.random()*99);
            while (j<= aleatorio) {
                if (aleatorio% j==0){
                    contador++;
                }
                j++;
            }
            if (contador==2) {
                System.out.println("el primo "+i+" generado "+ aleatorio);
            }
            i++;
            
        }
    }
    
}
