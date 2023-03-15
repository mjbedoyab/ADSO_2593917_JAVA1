import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese el primer numero: ");
        int pnumero = entrada.nextInt();
        System.out.print("ingrse el segundo numero: ");
        int snumero = entrada.nextInt();
        System.out.print("ingrse el tercer numero: ");
        int tnumero = entrada.nextInt();

        if (pnumero>snumero ) {
            System.out.println("esta en orden descendente ");
            
        } else if (pnumero<snumero) {
            System.out.println("esta en orden ascendente ");
        }
    }
}
