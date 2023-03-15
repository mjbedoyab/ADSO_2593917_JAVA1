import java.util.Scanner;

public class Eciclos8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => ingrese un numero de 6 dig :");
        int numero = entrada.nextInt();
        int resultado=0;
        int res=0;
        int sum=0;

        int cont=6;
        while (cont <= 0) {
          resultado = numero%10;
          res=cont/10;
          sum=res%10;
 

            cont++;
            
        }
        System.out.println(" dig " + sum );

    }
}


    
    
