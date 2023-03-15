import java.util.Scanner;

public class Text3{

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        System.out.print(" => ingrese una oracion ");
        String cadena = entrada.nextLine();

        String invertir ="";


        for(int i = cadena.length()-1; i >= 0; i--){
            invertir = invertir+ cadena.charAt(i);

        }
        System.out.print(invertir);
        


    }
}