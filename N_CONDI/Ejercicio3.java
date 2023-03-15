import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("coordenadas de plano cartesiano");
         
        System.out.println("ingrese valor x");
        int valorx = entrada.nextInt();
        System.out.println("ingrese valor y");
        int valory = entrada.nextInt();

        if (valorx <0 && valory >0) {
            System.out.println("se encuentra en el cuadrante 2");
        }else if (valorx>0 && valory>0) {
            System.out.println("se en cuentra en el cuadrante 1");
        }else if (valorx>0 && valory<0) {
            System.out.println("se en cuentra en el cuadrante 4");
        }else if (valorx<0 && valory<0) {
            System.out.println("se encuentra en el cuadrante 3");
        }
        

    }
    
}
