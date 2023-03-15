import java.util.Scanner;

public class Matrices1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un entero = FILAS");
        int filas = entrada.nextInt();

        System.out.println("ingrese un entero = COLUMNAS");
        int columnas = entrada.nextInt();

        int [][] vector = new int [filas] [columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.println("ingrese los valores");
                vector[i][j] = entrada.nextInt();
            }
        }

        for(int i = 0; i < filas; i++){
            for(int j = 0;j < columnas; j++){
                System.out.print("valor --> " + vector[i][j]);
            }
            System.out.println();
        }
    }
}