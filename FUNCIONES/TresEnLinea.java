public class TresEnLinea {
    private char[][] casillas;
    
    public TresEnLinea() {
        casillas = new char[3][3];
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = '-';
            }
        }
    }
    
    public void mostrar() {
        System.out.println("  1 2 3");
        for (int i = 0; i < casillas.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print(casillas[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean actualizar(int fila, int columna, char simbolo) {
        if (casillas[fila - 1][columna - 1] == '-') {
            casillas[fila - 1][columna - 1] = simbolo;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean hayGanador() {
        // Verificar filas
        for (int i = 0; i < casillas.length; i++) {
            if (casillas[i][0] != '-' && casillas[i][0] == casillas[i][1] && casillas[i][1] == casillas[i][2]) {
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < casillas[0].length; j++) {
            if (casillas[0][j] != '-' && casillas[0][j] == casillas[1][j] && casillas[1][j] == casillas[2][j]) {
                return true;
            }
        }
        // Verificar diagonales
        if (casillas[0][0] != '-' && casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2]) {
            return true;
        }
        if (casillas[0][2] != '-' && casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[0][2]) {
            return true;
        }
        return false;
    }

}

