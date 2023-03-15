import java.util.Scanner;

public class Text8 {
    
    public static void main(String[] args) {
        
        Scanner digito = new Scanner (System.in);

        System.out.print(" => cuantos numeros desea ingresar : ");
        int num = digito.nextInt();

        int arreglo [] = new int [num];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" => N : ");
            int n = digito.nextInt();
            arreglo[i]= n;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();

        int[] pares = new int[num];
        int[] impares = new int[num];
        int contpares = 0;
        int contimpar = 0;
        for (int i = 0; i < num; i++) {
            if (arreglo[i] % 2 ==0) {
                pares[contpares++]=arreglo[i];
                
            }else {
                impares[contimpar++]=arreglo[i];
                
            }
        }
        for (int i = 0; i < contpares; i++) {
            System.out.print("["+pares[i]+"]");
        }
        System.out.println(" lonfitud "+contpares);
        for (int i = 0; i < contimpar; i++) {
            System.out.print("["+impares[i]+"]");
        }
        System.out.println(" longitud "+contimpar);

    }
}
