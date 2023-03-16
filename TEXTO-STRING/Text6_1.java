import java.util.Scanner;

public class Text6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[3][3];

        // Inicializar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        int fila, columna;
        char jugadorActual = 'X';

        // Jugar hasta que alguien gane o empate
        while (true) {
            // Imprimir el tablero actual
            System.out.println("Tablero actual:");
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir la entrada del usuario
            System.out.println("Jugador " + jugadorActual + ", es tu turno.");
            System.out.print("Ingresa la fila (0-2): ");
            fila = scanner.nextInt();
            System.out.print("Ingresa la columna (0-2): ");
            columna = scanner.nextInt();

            // Verificar si la casilla está disponible
            if (tablero[fila][columna] != '-') {
                System.out.println("La casilla ya está ocupada. Intenta otra vez.");
                continue;
            }

            // Colocar la marca del jugador en la casilla
            tablero[fila][columna] = jugadorActual;

            // Verificar si alguien ganó
            if (ganador(tablero)) {
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                break;
            }

            // Verificar si hay empate
            if (empate(tablero)) {
                System.out.println("¡El juego ha terminado en empate!");
                break;
            }

            // Cambiar al siguiente jugador
            jugadorActual = jugadorActual == 'X' ? 'O' : 'X';
        }
    }

    // Verificar si alguien ganó
    public static boolean ganador(char[][] tablero) {
        // Revisar las filas
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
        }

        // Revisar las columnas
        for (int j = 0; j < tablero[0].length; j++) {
            if (tablero[0][j] != '-' && tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j]) {
                return true;
            }
        }

        // Revisar las diagonales
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }

        // Revisar las diagonales
        if (tablero[2][0] != '-' && tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2]) {
            return true;
        }
        return false;
    }
    public static boolean empate(char[][] tablero){
		for (int i=0; i<tablero.length; i++) {
			for (int j=0; j<tablero[i].length; j++ ) {
				if (tablero[i][j]=='-') {
					return false;
				}
			}
		}
		return true;
	}
}
