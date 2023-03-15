import java.util.Scanner;

public class Ejercicio6 {
    

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingres un numero de seis digitos ");
        int numero = entrada.nextInt();

        System.out.println("digita la opcion ");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            int total = numero%10;
            int neto = total;
            System.out.println("digito 1 es: " + neto);
            
        } else if (opcion == 2) {
            int total = numero/10;
            int neto = total%10;
            System.out.println("digito 2 es: " + neto);
        } else if (opcion == 3) {
            int total= numero/10;
            int total1=total/10;
            int neto = total1%10;
            System.out.println("digito 3 es: " + neto);
        } else if (opcion == 4) {
            int total = numero/10;
            int total1 = total/10;
            int total2 = total1/10;
            int neto = total2%10;
            System.out.println("digito 4 es: " + neto);
        } else if (opcion == 5) {
            int total = numero/10;
            int total1 = total/10;
            int total2 = total1/10;
            int total3 = total2/10;
            int neto = total3%10;
            System.out.println("digito 5 es: " + neto);
        } else if (opcion == 6) {
            int total = numero/10;
            int total1 = total/10;
            int total2 = total1/10;
            int total3 = total2/10;
            int total4 = total3/10;
            int neto = total4%10;
            System.out.println("digito 6 es: " + neto);
        }
    }
}
