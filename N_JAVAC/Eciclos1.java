import java.util.Scanner;

public class Eciclos1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => ingrese la cantidad de notas ");
        int cantidad = entrada.nextInt();

        float sumatoria =0;
        for (float i = 1; i <= cantidad ; i++) {
            System.out.print(" -> ingrse la nota "+i+" : ");
            float nota = entrada.nextFloat();

            sumatoria=sumatoria+nota;
            
        }
        float promedio = sumatoria/cantidad;
        System.out.println(" => EL PROMEDIO ES: " + promedio);
    }
    
}
