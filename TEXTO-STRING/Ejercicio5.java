import java.util.Scanner;

public class Ejercicio5{
    public static void main(String [] args){

        int contador  = 0;
        int menu  = 0;

        while(contador <= menu){

            Scanner entrada = new Scanner (System.in);
            
            System.out.print("Usuario ingrese su nombre :");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese la palabra secreta :");
            String palabra_s = entrada.nextLine();

            char [] letra  = new char[palabra_s.length()];
            for (int i = 0; i < palabra_s.length(); i++){
                letra[i]= palabra_s.charAt(i);
            }
           char [] guion = new char[palabra_s.length()];
            for (int i = 0; i < palabra_s.length(); i++){
                guion[i] = '_';
            }

            int intentos = 5;
            int palabra_sLength = palabra_s.length();
            int oportunidad = palabra_sLength;
            boolean correcto  = false;

            //imprimir muchos espacios para que no se vea la letra secreta

            for (int i = 0; i < 50; i++){
                System.out.println();
            }
            while(oportunidad > 1 || intentos > 0){
                System.out.println("Intentos:");
                System.out.println("="+intentos);
                System.out.println("Cantidad de palabras");
                System.out.println(guion);
                System.out.print("Ingrese una letra: ");
                char adivina  = entrada.next().charAt(0);

                for (int i = 0; i < palabra_sLength; i++){
                    if(adivina == guion[i]){
                        System.out.println("La letra ya fue utilizada");
                        correcto = true;
                        break;
                        
                    }
                    if(adivina == letra[i]){
                        guion[i] = adivina;
                        oportunidad--;
                        correcto = true; 
                    }
                }
                if(correcto == false){
                    System.out.println("La letra ingresada no forma parte de la palabra secreta");
                    intentos--;
                }else{
                    correcto = false;
                }
                if(oportunidad == 0){
                    System.out.println("HAS GANADO!");
                    System.out.println("Palabra secreta:"+palabra_s);
                    break;
                    
                }else if(intentos  == 0){
                    System.out.println("GAMER OVER");
                    System.out.println("Palabra secreta era:"+palabra_s);
                    break;
                    
                }

            }
            System.out.println("Menu:");
            System.out.println("|--------------------|");
            System.out.println("| 1.Iniciar juego    |");
            System.out.println("| 2.Salir            |");
            System.out.println("|--------------------|");

            System.out.println("Ingrese una opcion :");
            menu = entrada.nextInt();

            if (menu == 1){
                menu = menu;
            }else if(menu == 2){
               break;
            }

        } 
    }


}