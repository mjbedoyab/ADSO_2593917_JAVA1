import java.util.Scanner;

public class Eciclos21 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => ingrese un sueldo total: ");
        int sueldo = entrada.nextInt();
        System.out.print(" => cantidad de pagos ");
        int cantidad = entrada.nextInt();
        System.out.println("------------------------------------");

        System.out.println(" => 1. pagos de igual valor ");
        System.out.println(" => 2. primer pago diferente ");
        System.out.println(" => 3. ultimo pago diferente ");
        System.out.println(" => 4. primer y ultimo pago dferentes");

        System.out.println("------------------------------------");

        System.out.println(" => eliga opcion ");
        int opcion = entrada.nextInt();

        if (opcion== 1) {
            int resultado = sueldo/cantidad;
            for (int i = 0; i < cantidad; i++) {
                System.out.println(" pago mes : "+ resultado);
                
            }
        }else if(opcion==2){
            System.out.println(" ingrese sueldo");
            int suel = entrada.nextInt();
            int resta = sueldo-suel;
            int menos= cantidad-1;
            int resultado= suel/menos;
            System.out.println(" pago mes : " + resta);
            for (int i = 0; i < menos; i++) {
                System.out.println(" pago mes : "+ resultado);

            }


        }


    }
    
}
