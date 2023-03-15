import java.util.Scanner;

public class Eciclos2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" => ingrese la cantidad de materias ");
        int cantidad = entrada.nextInt();
        System.out.println("=> ingrese la cantidad de creditos ");
        int creditos = entrada.nextInt();

        float prom = 0;
        float sumatoria =0;
        for (float i = 1; i <= cantidad; i++) {
            System.out.print(" -> ingrse la nota de la materia "+i+" : ");
            float nota = entrada.nextFloat();
            System.out.print(" -> ingrese los creditos "+i+" : ");
            float credi = entrada.nextFloat();

            sumatoria=sumatoria+credi;
            prom=prom+ (nota*credi);
            
        }
        float promedio =prom/sumatoria;
        System.out.println("total de creditos es: " + sumatoria);
        System.out.println("promedio del semestre es: " + promedio);
        
    }
    
}
