import java.util.Scanner;

public class Ttext1 {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = letra.nextLine();

        // Validación de la contraseña utilizando expresiones regulares
        boolean contrasenaValida = contrasena.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!¡?\\[\\]{}()\\/*\\-])(?=\\S+$).{8,}");

        if (contrasenaValida) {
            System.out.println("La contraseña es valida.");
        } else {
            System.out.println("La contraseña no es valida.");
        }
    }
}

