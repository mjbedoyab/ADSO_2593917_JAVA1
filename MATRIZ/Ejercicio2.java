import java.util.Scanner;
public class Ejercicio2{

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        //definir mapa del laberinto

        int matriz [][]={
                       {1,1,1,1,1,1,1},
                       {1,0,0,0,1,0,3},
                       {1,0,1,0,1,0,1},
                       {1,0,1,0,1,0,1},
                       {0,2,1,0,0,0,1},
                       {1,1,1,1,1,1,1},
                       };
        
         boolean jugando = true;
         int pos_f = 4;
         int pos_c = 1;
         while (jugando) {
        
         // imprimir laberinto
         // condicion del ciclo si se repite o no
         // 6 filas y 7 columnas
         // ciclo del juego

         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]);
                
            }
            System.out.println();
            
         }
         // imprimir menu
         System.out.print(" 1. Arriba 2. Abajo 3. Derecha 4. Izquierda");
         int opcion = entrada.nextInt();
         // condicion segun la seleccion del ususario
         // codigo para mover arriba

         if (opcion== 1) {
            // PREGUNTAR SI EL MOVIMIENTO ES VALIDO
            if (matriz[pos_f-1][pos_c]==0) {
                matriz[pos_f-1][pos_c] = 2;
                matriz[pos_f][pos_c] = 0;
                pos_f = pos_f-1;
                pos_c = pos_c;
                
            }else if (matriz[pos_f-1][pos_c]==3) {
                jugando = false;
                
            }
            
         }
         // codigo para mover abajo
         if (opcion==2) {
            // PREGUNTAR SI EL MOVIMIENTO ES VALIDO
            if (matriz[pos_f+1][pos_c]==0) {
                matriz[pos_f+1][pos_c] = 2;
                matriz[pos_f][pos_c] = 0;
                pos_f = pos_f+1;
                pos_c = pos_c;
                
            }else if (matriz[pos_f+1][pos_c]==3) {
                jugando = false;
                
            }
            
         }
         // codigo para mover derecha
         if (opcion==3) {
            // PREGUNTAR SI EL MOVIMIENTO ES VALIDO
            if (matriz[pos_f][pos_c+1]==0) {
                matriz[pos_f][pos_c+1] = 2;
                matriz[pos_f][pos_c] = 0;
                pos_f = pos_f;
                pos_c = pos_c+1;
                
            }else if (matriz[pos_f][pos_c+1]==3) {
                jugando = false;
                
            }
         }
         // codigo para mover izquierda
         if (opcion==4) {
            // PREGUNTAR SI EL MOVIMIENTO ES VALIDO
            if (matriz[pos_f][pos_c-1]==0) {
                matriz[pos_f][pos_c-1] = 2;
                matriz[pos_f][pos_c] = 0;
                pos_f = pos_f;
                pos_c = pos_c-1;
                
            }else if (matriz[pos_f][pos_c-1
            ]==3) {
                jugando = false;
                
            }
            
         }
         if (opcion<1 && opcion>4) {
            System.out.print("MOVIMIENTO INVALIDO");
            
         }
            
         }
         System.out.println(" GAME OVER - LEVEL COMPLETE ");
 


    }
}