import java.util.Scanner;

public class Text6 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        char triki [][] = new char [3][3];

        boolean jugando = true;
        int pos_1=0;
        int pos_2=0;
        

        while (jugando) {

            for (int i = 0; i < triki.length; i++) {
                for (int j = 0; j < triki.length; j++) {
                    System.out.print(" [ "+triki[i][j]+" ] ");
                    
                }
                System.out.println();
            }

            System.out.println(" jugador 1 eliga posicion: ");
            pos_1=entrada.nextInt();

            if (pos_1 ==1) {
                triki[0][0]= 1 ;
            }else if (pos_1==2) {
                triki[0][1]= 1;
            }else if (pos_1==3) {
                triki[0][2]= 1;
            }else if (pos_1==4) {
                triki[1][0]= 1;
            }else if (pos_1==5) {
                triki[1][1]= 1;
            }else if (pos_1==6) {
                triki[1][2]= 1;
            }else if (pos_1==7) {
                triki[2][0]= 1;
            }else if (pos_1==8) {
                triki[2][1]= 1;
            }else if (pos_1==9) {
                triki[2][2]= 1;
            }
            for (int i = 0; i < triki.length; i++) {
                for (int j = 0; j < triki.length; j++) {
                    System.out.print(" [ "+triki[i][j]+" ] ");
                    
                }
                System.out.println();
            }
            System.out.println(" jugador 2 eliga posicion: ");
            pos_2=entrada.nextInt();

            if (pos_2 ==1) {
                triki[0][0]= 3 ;
            }else if (pos_2==2) {
                triki[0][1]= 3;
            }else if (pos_2==3) {
                triki[0][2]= 3;
            }else if (pos_2==4) {
                triki[1][0]= 3;
            }else if (pos_2==5) {
                triki[1][1]= 3;
            }else if (pos_2==6) {
                triki[1][2]= 3;
            }else if (pos_2==7) {
                triki[2][0]= 3;
            }else if (pos_2==8) {
                triki[2][1]= 3;
            }else if (pos_2==9) {
                triki[2][2]= 3;
            }

            if ((pos_1 == triki[0][0])&&(pos_1 == triki[0][1])&&(pos_1 == triki[0][2])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }else if ((pos_1 == triki[1][0])&&(pos_1 == triki[1][1])&&(pos_1 == triki[1][2])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }else if ((pos_1 == triki[2][0])&&(pos_1 == triki[2][1])&&(pos_1 == triki[2][2])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }else if ((pos_1 == triki[0][0])&&(pos_1 == triki[1][0])&&(pos_1 == triki[2][0])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }else if ((pos_1 == triki[0][1])&&(pos_1 == triki[1][1])&&(pos_1 == triki[2][1])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }else if ((pos_1 == triki[0][2])&&(pos_1 == triki[1][2])&&(pos_1 == triki[2][2])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }else if ((pos_1 == triki[0][0])&&(pos_1 == triki[1][1])&&(pos_1 == triki[1][2])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }else if ((pos_1 == triki[0][2])&&(pos_1 == triki[1][1])&&(pos_1 == triki[2][0])) {
                System.out.println(" jugador 1 GANO ");
                break;
            }

            if ((pos_2 == triki[0][0])&&(pos_2 == triki[0][1])&&(pos_2 == triki[0][2])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }else if ((pos_2 == triki[1][0])&&(pos_2 == triki[1][1])&&(pos_2 == triki[1][2])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }else if ((pos_2 == triki[2][0])&&(pos_2 == triki[2][1])&&(pos_2 == triki[2][2])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }else if ((pos_2 == triki[0][0])&&(pos_2 == triki[1][0])&&(pos_2 == triki[2][0])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }else if ((pos_2 == triki[0][1])&&(pos_2 == triki[1][1])&&(pos_2 == triki[2][1])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }else if ((pos_2 == triki[0][2])&&(pos_2 == triki[1][2])&&(pos_2 == triki[2][2])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }else if ((pos_2 == triki[0][0])&&(pos_2 == triki[1][1])&&(pos_2 == triki[1][2])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }else if ((pos_2 == triki[0][2])&&(pos_2 == triki[1][1])&&(pos_2 == triki[2][0])) {
                System.out.println(" jugador 2 GANO ");
                break;
            }

            
        }
        

        

        
    }
    
}
