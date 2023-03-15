import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

       System.out.print("Ingrese el numero de filas");
       int filas = entrada.nextInt();

       System.out.print("Ingrese el numero de columnas");
       int columnas = entrada.nextInt();

        int matriz[][]= new int [filas][columnas];

        for (int i =0; i < matriz.length;i++){

            for (int j =0; j < matriz[i].length;j++){

                System.out.print("Ingrese el componente: ");
                matriz[i][j]= entrada.nextInt();

            }

        }
        for (int i =0; i < matriz.length;i++){

            for (int j =0; j < matriz[i].length;j++){

                System.out.print(matriz[i][j]+" ");                                                 

            }
            System.out.println();

        }
        System.out.println("ultima fila");
        for (int j =0; j < matriz[matriz.length-1].length;j++){

            System.out.print(matriz[matriz.length-1][j]+" ");
        }

    }
}