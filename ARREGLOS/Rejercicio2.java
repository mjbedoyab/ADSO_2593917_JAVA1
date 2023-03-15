import java.util.Scanner;

public class Rejercicio2 {
    public static void main(String[] args) 

    Scanner entrada=new Scanner(System.in);

    System.out.println(" => ingrese un numero : ");
    int n = entrada.nextInt();

    int [] arreglos=new int [n];

    for (int i = 0; i < n; i++) {
        arreglos[i] = (int)(Math.random()*100);
        int res=0;
        for (int j = 0; j < arreglos[i] ; j++) {
            if (arreglos[i]%j==0) {
                res++;
                
            }
            
        }
        
    }
    for (int i = 0; i < arreglos.length; i++) {

        System.out.print("["+arreglos[i]+"]");
    }

    
}

