import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => INGRESE SU EDAD: ");
        int edad = entrada.nextInt();

        if (edad >0 && edad <= 17) {
            
            System.out.println(" recibe un auxilio de: 800000 ");
            
        }else if (edad >=18 && edad <= 60){

            System.out.println(" pagas un impuesto de: 200000 ");
            
        }
    }
    
}
