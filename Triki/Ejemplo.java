import java.util.Random;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int jugador, ia;
        String[] opciones = {"Piedra", "Papel", "Tijera"};

        System.out.println("Bienvenido al juego Piedra, papel o tijera!");
        int opcion;

        

        while (true) {
            System.out.println("Ingrese su jugada (1 para Piedra, 2 para Papel, 3 para Tijera):");
            jugador = sc.nextInt();

            if (jugador < 1 || jugador > 3) {
                System.out.println("Jugada inválida. Inténtelo de nuevo.");
                continue;
            }

            ia = rnd.nextInt(3) + 1;

            System.out.println("Usted eligió " + opciones[jugador - 1]);
            System.out.println("La IA eligió " + opciones[ia - 1]);

            if (jugador == ia) {
                System.out.println("¡Empate!");
                
            } else if ((jugador == 1 && ia == 3) || (jugador == 2 && ia == 1) || (jugador == 3 && ia == 2)) {
                System.out.println("¡Usted gana!");
                
            } else {
                System.out.println("¡La IA gana!");
                
            } 
        }

        
    }
}


