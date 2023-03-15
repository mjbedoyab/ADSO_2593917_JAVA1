import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero de maximo 6 digitos :");
        int numero = entrada.nextInt();

        System.out.println("//--------FORMATO DE MONEDA-------//");

        int valor = (numero/10)%10;
        int valor2 =(numero/100)%10;
        int valor3 =(numero/1000)%10;
        int valor4= (numero/10000)%10;
        int valor5= (numero/100000)%10;
        int valor6= (numero/1000000)%10;
        int valor7= (numero/10000000)%10;
        int valor8= (numero/100000000)%10;
        int valor9= (numero/1000000000)%10;
        int valor10= (numero/1000000000)%10;

        System.out.println("moneda: " +valor10);
        System.out.println("moneda: " +valor10+valor9);
        System.out.println("moneda: " +valor10+valor9+valor8);
        System.out.println("moneda: " +valor10+valor9+valor8+valor7);
        System.out.println("moneda: " +valor10+valor9+valor8+valor7+valor6);
        System.out.println("moneda: " +valor10+valor9+valor8+valor7+valor6+valor5);
        System.out.println("moneda: " +valor10+valor9+valor8+valor7+valor6+valor5+valor4);
        System.out.println("moneda: " +valor10+valor9+valor8+valor7+valor6+valor5+valor4+valor3);
        System.out.println("moneda: " +valor10+valor9+valor8+valor7+valor6+valor5+valor4+valor3+valor2);
        System.out.println("moneda: " +valor10+valor9+valor8+valor7+valor6+valor5+valor4+valor3+valor2+valor);






        


    }
    
}
