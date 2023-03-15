import java.util.Scanner;

public class Eciclos7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" => ingrese numero 1");
        int n1 =entrada.nextInt();
        System.out.println(" => ingrese numero 2");
        int n2 =entrada.nextInt();
        System.out.println(" => ingrese numero 3");
        int n3 =entrada.nextInt();

        int cont=1;
        while ((cont%n1 != 0)||(cont%n2 !=0)||(cont%n3 !=0)) {
            cont++;
        }
        System.out.println(" => el MCM es: "+ cont);
    }
}
