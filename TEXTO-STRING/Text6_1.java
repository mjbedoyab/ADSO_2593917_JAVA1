import java.util.Scanner;

public class Text6_1 {

    public static void main(String[] args) {
        int[][] tablero = new int[3][3]; // Matriz para representar el tablero
        int jugador = 1; // Jugador inicial
        Scanner scanner = new Scanner(System.in); // Para leer las jugadas del jugador
        
        // Bucle principal
        while (true) {
            // Mostrar el tablero actual
            System.out.println("Tablero:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            
            // Pedir al jugador que realice su jugada
            System.out.println("Turno del jugador " + jugador + ". Introduce la fila (0-2):");
            int fila = scanner.nextInt();
            System.out.println("Introduce la columna (0-2):");
            int columna = scanner.nextInt();
            
            // Verificar si la jugada es válida
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Jugada inválida. Introduce valores entre 0 y 2.");
            } else if (tablero[fila][columna] != 0) {
                System.out.println("Jugada inválida. La celda ya está ocupada.");
            } else {
                // Asignar la jugada al jugador correspondiente
                tablero[fila][columna] = jugador;
                
                // Verificar si hay un ganador
                if (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador ||
                    tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador ||
                    tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador );

            }
        }
    }
}
