import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("=> ingrese FECHA DE NACIMIENTO DD/MM/AA : ");
        int numero = entrada.nextInt();

        int dig_1 = numero%10;
        int dig_2 = (numero/10)%10;
        int dig_3 = (numero/100)%10;
        int dig_4 = (numero/1000)%10;
        int dig_5 = (numero/10000)%10;
        int dig_6 = (numero/100000);

        if (dig_6 == 3) {
            if (dig_5 == 0) {
                System.out.print(" TRINTA DE ");  
            }else if (dig_6 == 3) {
                if (dig_5 == 1) {
                    System.out.print(" TREINTA Y UNO DE ");
                }
                
            }
            
        }
        
        if (dig_6 == 2) {
            if (dig_5 == 0) {
                System.out.print(" VEINTE DE ");
            }else if (dig_6 == 2) {
                if (dig_5 == 1) {
                    System.out.print(" VEINTIUNO DE ");
                }
            }
            
        }
        if (dig_6 == 2) {
            if (dig_5 == 2) {
                System.out.print(" VEINTIDOS DE ");
            }else if (dig_6 == 2) {
                if (dig_5 == 3) {
                    System.out.print(" VEINTIRES DE ");
                }
            }
            
        }
        if (dig_6 == 2) {
            if (dig_5 == 4) {
                System.out.print(" VEINTICUATRO DE ");
            }else if (dig_6 == 2) {
                if (dig_5 == 5) {
                    System.out.print(" VEINTICINCO DE ");
                }
            }
            
        }
        if (dig_6 == 2) {
            if (dig_5 == 6) {
                System.out.print(" VEINTISEIS DE ");
            }else if (dig_6 == 2) {
                if (dig_5 == 7) {
                    System.out.print(" VEINTISIETE DE ");
                }
            }
            
        }
        if (dig_6 == 2) {
            if (dig_5 == 8) {
                System.out.print(" VEINTIOCHO DE ");
            }else if (dig_6 == 2) {
                if (dig_5 == 9) {
                    System.out.print(" VEINTINUEVE DE ");
                }
            }
            
        }
        if (dig_6 == 1) {
            if (dig_5 == 0) {
                System.out.print(" DIEZ DE ");
            }else if (dig_6 == 1) {
                if (dig_5 == 1) {
                    System.out.print(" ONCE DE ");
                }
            }
            
        }
        if (dig_6 == 1) {
            if (dig_5 == 2) {
                System.out.print(" DOCE DE ");
            }else if (dig_6 == 1) {
                if (dig_5 == 3) {
                    System.out.print(" TRECE DE ");
                }
            }
            
        }
        if (dig_6 == 1) {
            if (dig_5 == 4) {
                System.out.print(" CATORCE DE ");
            }else if (dig_6 == 1) {
                if (dig_5 == 5) {
                    System.out.print(" QUINCE DE ");
                }
            }
            
        }
        if (dig_6 == 1) {
            if (dig_5 == 6) {
                System.out.print(" DIECISEIS DE ");
            }else if (dig_6 == 1) {
                if (dig_5 == 7) {
                    System.out.print(" DIECISIETE DE ");
                }
            }
            
        }
        if (dig_6 == 1) {
            if (dig_5 == 8) {
                System.out.print(" DIECIOCHO DE ");
            }else if (dig_6 == 1) {
                if (dig_5 == 9) {
                    System.out.print(" DIECINUEVE DE ");
                }
            }
            
        }
        if (dig_6 == 0) {
            if (dig_5 == 1) {
                System.out.print(" UNO DE ");
            }else if (dig_6 == 0) {
                if (dig_5 == 2) {
                    System.out.print(" DOS DE ");
                }
            }
            
        }
        if (dig_6 == 0) {
            if (dig_5 == 3) {
                System.out.print(" TRES DE ");
            }else if (dig_6 == 0) {
                if (dig_5 == 4) {
                    System.out.print(" CUATRO DE ");
                }
            }
            
        }
        if (dig_6 == 0) {
            if (dig_5 == 5) {
                System.out.print(" CINCO DE ");
            }else if (dig_6 == 0) {
                if (dig_5 == 6) {
                    System.out.print(" SEIS DE ");
                }
            }
            
        }
        if (dig_6 == 0) {
            if (dig_5 == 7) {
                System.out.print(" SIETE DE ");
            }else if (dig_6 == 0) {
                if (dig_5 == 8) {
                    System.out.print(" OCHO DE ");
                }
            }
            
        }
        if (dig_6 == 0) {
            if (dig_5 == 9) {
                System.out.print(" NUEVE DE ");
            }
            
        }
        if (dig_4 == 0) {
            if (dig_3 == 1) {
                System.out.print(" ENERO DEL ");
            }else if (dig_4 == 0) {
                if (dig_3 == 2) {
                    System.out.print(" FEBRERO DEL ");
                }
            }
            
        }
        if (dig_4 == 0) {
            if (dig_3 == 3) {
                System.out.print(" MARZO DEL ");
            }else if (dig_4 == 0) {
                if (dig_3 == 4) {
                    System.out.print(" ABRIL DEL ");
                }
            }
            
        }
        if (dig_4 == 0) {
            if (dig_3 == 5) {
                System.out.print(" MAYO DEL ");
            }else if (dig_4 == 0) {
                if (dig_3 == 6) {
                    System.out.print(" JUNIO DEL ");
                }
            }
            
        }
        if (dig_4 == 0) {
            if (dig_3 == 7) {
                System.out.print(" JULIO DEL ");
            }else if (dig_4 == 0) {
                if (dig_3 == 8) {
                    System.out.print(" AGOSTO DEL ");
                }
            }
            
        }
        if (dig_4 == 0) {
            if (dig_3 == 9) {
                System.out.print(" SEPTIEMBRE DEL ");
            }else if (dig_4 == 1) {
                if (dig_3 == 0) {
                    System.out.print(" OCTUBRE DEL ");
                }
            }
            
        }
        if (dig_4 == 1) {
            if (dig_3 == 1) {
                System.out.print(" NOVIEMBRE DEL ");
            }else if (dig_4 == 1) {
                if (dig_3 == 2) {
                    System.out.print(" DICIEMBRE DEL ");
                }
            }
            
        }
        if (dig_2 == 9) {
            if (dig_1 == 9) {
                System.out.print(" MIL NOVECIENTOS NOVENTA Y NUEVE ");
            }else if (dig_4 == 9) {
                if (dig_3 == 8) {
                    System.out.print(" MIL NOVECIENTOS NOVENTA Y OCHO ");
                }
            }
            
        }
        if (dig_2 == 9) {
            if (dig_1 == 7) {
                System.out.print(" MIL NOVECIENTOS NOVENTA Y SIETE ");
            }else if (dig_2 == 9) {
                if (dig_1 == 6) {
                    System.out.print(" MIL NOVECIENTOS NOVENTA Y SEIS ");
                }
            }
            
        }
        if (dig_2 == 9) {
            if (dig_1 == 5) {
                System.out.print(" MIL NOVECIENTOS NOVENTA Y CINCO ");
            }else if (dig_2 == 9) {
                if (dig_1 == 4) {
                    System.out.print(" MIL NOVECIENTOS NOVENTA Y CUATRO ");
                }
            }
            
        }
        if (dig_2 == 9) {
            if (dig_1 == 3) {
                System.out.print(" MIL NOVECIENTOS NOVENTA Y TRES ");
            }else if (dig_2 == 9) {
                if (dig_1 == 2) {
                    System.out.print(" MIL NOVECIENTOS NOVENTA Y DOS ");
                }
            }
            
        }
        if (dig_2 == 9) {
            if (dig_1 == 1) {
                System.out.print(" MIL NOVECIENTOS NOVENTA Y UNO ");
            }else if (dig_2 == 9) {
                if (dig_1 == 0) {
                    System.out.print(" MIL NOVECIENTOS NOVENTA ");
                }
            }
            
        }
        if (dig_2 == 2) {
            if (dig_1 == 0) {
                System.out.print(" DOS MIL VEINTE ");
            }else if (dig_2 == 2) {
                if (dig_1 == 1) {
                    System.out.print(" DOS MIL VEINTIUNO ");
                }
            }
            
        }

    }
    
}
