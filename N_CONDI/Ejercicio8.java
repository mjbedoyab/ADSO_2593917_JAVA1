import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("=> ingrese un numero: ");
        int numero = entrada.nextInt();

        int dig_1 = numero%10;
        int dig_2 = (numero/10)%10;
        int dig_3 = (numero/100)%10;
        int dig_4 = (numero/1000)%10;
        int dig_5 = (numero/10000)%10;
        int dig_6 = (numero/100000);

        if (dig_6 == 9) {
            System.out.print(" NOVECIENTOS ");
        }else if (dig_6 == 8) {
            System.out.print(" OCHOCIENTOS ");
        }else if (dig_6 == 7) {
            System.out.print(" SETECIENTOS ");
        }else if (dig_6 == 6) {
            System.out.print(" SEICIENTOS ");
        }else if (dig_6 == 5) {
            System.out.print(" QUINIENTOS ");
        }else if (dig_6 == 4) {
            System.out.print(" CUATROCIENTOS ");
        }else if (dig_6 == 3) {
            System.out.print(" TRECIENTOS ");
        }else if (dig_6 == 2) {
            System.out.print(" DOCIENTOS ");
        }else if (dig_6 == 1) {
            if (dig_5 == 0 && dig_4 == 0) {
                System.out.print(" CIEN ");
            }else {
                System.out.print(" CIENTO ");
            }
        }else if (dig_6 == 0) {
            System.out.print("");
        }

        if (dig_5 == 9) {
            if (dig_4 == 0) {
                System.out.print(" NOVENTA ");   
            }else{
                System.out.print(" NOVENTA Y ");
            }
            
        }else if (dig_5 == 8) {
            if (dig_4 == 0) {
                System.out.print(" OCHENTA ");
            }else{
                System.out.print(" OCHENTA Y ");
            }
            
        }else if (dig_5 == 7) {
            if (dig_4 == 0) {
                System.out.print(" SETENTA ");
            }else{
                System.out.print(" SETENTA Y");
            }
            
        }else if (dig_5 == 6) {
            if (dig_4 == 0) {
                System.out.print(" SESENTA ");
            }else{
                System.out.print(" SESENTA Y ");
            }
            
        }else if (dig_5 == 5) {
            if (dig_4 == 0) {
                System.out.print(" CINCUENTA ");
            }else{
                System.out.print(" CINCUENTA Y ");
            }
            
        }else if (dig_5 == 4) {
            if (dig_4 == 0) {
                System.out.print(" CUARENTA ");
            }else{
                System.out.print(" CUARENTA Y ");
            }
        }else if (dig_5 == 3) {
            if (dig_4 == 0) {
                System.out.print(" TREINTA ");
            }else{
                System.out.print(" TRENTA Y");
            }
        }else if (dig_5 == 2) {
            if (dig_4 == 0) {
                System.out.print(" VENTE");
            }else{
                System.out.print(" VEINTI ");
            }
        }else if (dig_5 == 1) {
            if (dig_4 == 0) {
                System.out.print(" DIEZ ");
            }else if (dig_4 == 1) {
                System.out.print(" ONCE ");
            }else if (dig_4 == 2) {
                System.out.print(" DOCE ");
            }else if (dig_4 == 3) {
                System.out.print(" TRECE ");
            }else if (dig_4 == 4) {
                System.out.print(" CATORCE ");
            }else if (dig_4 == 5) {
                System.out.print(" QUINCE ");
            }else if (dig_4 == 6) {
                System.out.print(" DIECISEIS ");
            }else{
                System.out.print(" DIECI ");
            }
        }else if (dig_5 == 0) {
            System.out.print("");  
        }

        if (dig_4 == 9) {
            if (dig_3 == 0) {
                System.out.print(" NUEVEMIL ");
            }else{
                System.out.print(" NUEVEMIL  ");
            }  
        }else if (dig_4 == 8) {
            if (dig_3 == 0) {
                System.out.print(" OCHO MIL ");
            }else{
                System.out.print(" OCHO MIL  ");
            }
        }else if (dig_4 == 7) {
            if (dig_3 == 0) {
                System.out.print(" SIETE MIL ");
            }else{
                System.out.print(" SIETE MIL  ");
            }
        }else if (dig_4 == 6) {
            if (dig_3 == 0) {
                System.out.print(" SEIS MIL ");
            }else{
                System.out.print(" SEIS MIL  ");
            }
        }else if (dig_4 == 5) {
            if (dig_3 == 0) {
                System.out.print(" CINCO MIL ");
            }else{
                System.out.print(" CINCO MIL  ");
            }
        }else if (dig_4 == 4) {
            if (dig_3 == 0) {
                System.out.print(" CUATRO MIL ");
            }else{
                System.out.print(" CUATRO MIL  ");
            }
        }else if (dig_4 == 3) {
            if (dig_3 == 0) {
                System.out.print(" TRES MIL ");
            }else{
                System.out.print(" TRES MIL  ");
            }
        }else if (dig_4 == 2) {
            if (dig_3 == 0) {
                System.out.print(" DOS MIL ");
            }else{
                System.out.print(" DOS MIL  ");
            }
        }else if (dig_4 == 1) {
            if (dig_3 == 0) {
                System.out.print(" MIL ");
            }else if (dig_3 == 1) {
                System.out.print(" CIEN ");
            }else if (dig_3 == 2) {
                System.out.print(" DOCIENTOS ");
            }else if (dig_3 == 3) {
                System.out.print(" TRECIENTOS ");
            }else if (dig_3 == 4) {
                System.out.print(" CUATROCIENTOS ");
            }else if (dig_3 == 5) {
                System.out.print(" QUINIENTOS ");
            }else if (dig_3 == 6) {
                System.out.print(" SEICIENTOS ");
            }else if (dig_3 == 7) {
                System.out.print(" SETECIENTOS ");
            }else if (dig_3 == 8) {
                System.out.print(" OCHOCIENTOS ");
            }else if (dig_3 == 9) {
                System.out.print(" NOVECIENTOS ");
            }
        }else if (dig_4 == 0) {
            System.out.print("");
        }

        if (dig_3 == 9) {
            System.out.print(" NOVECIENTOS ");
        }else if (dig_3 == 8) {
            System.out.print(" OCHOCIENTOS ");
        }else if (dig_3 == 7) {
            System.out.print(" SETECIENTOS ");
        }else if (dig_3 == 6) {
            System.out.print(" SEICIENTOS ");
        }else if (dig_3 == 5) {
            System.out.print(" QUINIENTOS ");
        }else if (dig_3 == 4) {
            System.out.print(" CUATROCIENTOS ");
        }else if (dig_3 == 3) {
            System.out.print(" TRECIENTOS ");
        }else if (dig_3 == 2) {
            System.out.print(" DOCIENTOS ");
        }else if (dig_3 == 1) {
            if (dig_2 == 0 && dig_1 == 0) {
                System.out.print(" CIEN ");   
            }else{
                System.out.print(" CIENTO ");
            }
        }else if (dig_3 == 0) {
            System.out.print("");
        }
        if (dig_2 ==9 ) {
            if (dig_1 == 0) {
                System.out.print(" NOVENTA ");
            }else{
                System.out.print(" NOVENTA Y ");
            }
        }else if (dig_2 == 8) {
            if (dig_1 == 0) {
                System.out.print(" OCHENTA ");
            }else{
                System.out.print(" OCHENTA Y ");
            }
        }else if (dig_2 == 7) {
            if (dig_1 == 0) {
                System.out.print(" SETENTA ");
            }else{
                System.out.print(" SETENTA Y ");
            }
        }else if (dig_2 == 6) {
            if (dig_1 == 0) {
                System.out.print(" SESENTA ");
            }else{
                System.out.print(" SESENTA Y ");
            }
        }else if (dig_2 == 5) {
           if (dig_1 == 0) {
            System.out.print(" CINCUENTA ");
           } else{
            System.out.print(" CINCUENTA Y ");
           }
        }else if (dig_2 == 4) {
            if (dig_1 == 0) {
                System.out.print(" CUARENTA ");
            }else{
                System.out.print(" CUARENTA Y ");
            }
        }else if (dig_2 == 3) {
            if (dig_1 == 0) {
                System.out.print(" TREINTA ");
            }else{
                System.out.print(" TRENTA Y ");
            }
        }else if (dig_2 == 2) {
            if (dig_1 == 0) {
                System.out.print(" VENTE ");
            }else{
                System.out.print(" VENTY ");
            }
        }else if (dig_2 == 1) {
            if (dig_1 == 0) {
                System.out.print(" DIEZ ");
            }else if (dig_1 == 1) {
                System.out.print(" UNO ");
            }else if (dig_1 == 2) {
                System.out.print(" DOS ");
            }else if (dig_1 == 3) {
                System.out.print(" TRES ");
            }else if (dig_1 == 4) {
                System.out.print(" CUATRO ");
            }else if (dig_1 == 5) {
                System.out.print(" CINCO ");
            }else if (dig_1 == 6) {
                System.out.print(" SEIS ");
            }else if (dig_1 == 7) {
                System.out.print(" SIETE ");
            }else if (dig_1 == 8) {
                System.out.print(" OCHO ");
            }else if (dig_1 == 9) {
                System.out.print(" NUEVE ");
            }
        }else if (dig_2 == 0) {
            System.out.println("");
        }
        if (dig_1 == 9) {
            System.out.print(" NUEVE ");
        }else if (dig_1 == 8) {
            System.out.print(" OCHO ");
        }else if (dig_1 == 7) {
            System.out.print(" SIETE ");
        }else if (dig_1 == 6) {
            System.out.print(" SEIS ");
        }else if (dig_1 == 5) {
            System.out.print(" CINCO ");
        }else if (dig_1 == 4) {
            System.out.print(" CUATRO ");
        }else if (dig_1 == 3) {
            System.out.print(" TRES ");
        }else if (dig_1 == 2) {
            System.out.print(" DOS ");
        }else if (dig_1 == 1) {
            System.out.print(" UNO ");
        }else if (dig_1 ==0) {
            System.out.println("");
        } 
            
        


    }
    
}
