import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" ingrese direccion: ");
        String direccion = entrada.nextLine();

        char nuevo = direccion;
        System.out.println("resultado: "+nuevo);

        
    }
    
}
