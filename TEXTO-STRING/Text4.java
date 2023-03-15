import java.util.Scanner;
public class Text4{
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        
        System.out.print(" => ingrese una oracion ");
        String cadena = entrada.nextLine();

        String nuevo = cadena.toLowerCase();
        boolean res;
        int tdt = cadena.length()-1;
        
        for(int i=0; i<=tdt; i++){
            char inicio = cadena.charAt(i);
            char fin = cadena.charAt(tdt);
            if(inicio != fin){
                res = false;
                System.out.println("no es palindromo");
            }else{
                res = true;
                System.out.println("si es palindromo");
            }
        }

    }

}