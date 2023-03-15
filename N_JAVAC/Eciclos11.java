import java.util.Scanner;

public class Eciclos11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => ingrse un numero entre 1 y 6 : ");
        int numero=entrada.nextInt();
        int construido=0;
        int producto=0;

        for (int i = 1; i <= numero; i++) {
            int aleatorio=(int)(Math.random()*10);
            construido=(construido*10)+aleatorio;
            producto=construido*2;

            
        }
        System.out.println(" el numero construido es: "+ construido );
        System.out.println(" el resultado del producto es: "+ producto );

    }
    
}
