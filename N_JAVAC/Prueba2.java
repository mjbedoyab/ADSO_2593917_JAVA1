import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {

        //creacion de variables de entrada
        Scanner entrada = new Scanner(System.in);

        //creacion de variable
        int cant_poblacion_col=0;
        int cant_poblacion_usa = 35000000;

        //creacion de salida
        System.out.println("la poblacion de COL es:_ " + cant_poblacion_col);
        System.out.println("la poblacion de USA es: " + cant_poblacion_usa);

        //lectura de datos
        System.out.print("ingrese poblacion COL es: ");
        cant_poblacion_col = entrada.nextInt();
        
        System.out.println("la nueva poblacion de COL es: " + cant_poblacion_col);


        
    }
}
