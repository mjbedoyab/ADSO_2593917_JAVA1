import java.util.Scanner;

public class Eciclos4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);



        int tipo =0;


        while (tipo != 3) {
            System.out.println(" |-----------BIENVENIDO-----------| ");
            System.out.println(" | 1. Docente                     | ");
            System.out.println(" | 2. Estudiante                  | ");
            System.out.println(" | 3. Salir                       | ");
            System.out.println(" |--------------------------------| ");
            

            System.out.println(" => ingrese tipo ");
            tipo = entrada.nextInt();

            if (tipo == 1 ) {
                System.out.println(" => ingrese la cantidad de notas ");
                int cantidad1 = entrada.nextInt();
        
                float sumatoria1 =0;
                for (float j = 1; j <= cantidad1 ; j++) {
                    System.out.print(" -> ingrse la nota "+j+" : ");
                    float nota1 = entrada.nextFloat();
        
                    sumatoria1=sumatoria1+nota1;
                    
                }
                float promedio = sumatoria1/cantidad1;
                System.out.println(" => EL PROMEDIO ES: " + promedio);

                
            }else if (tipo == 2) {
                System.out.println(" => ingrese la cantidad de materias ");
                int cantidad = entrada.nextInt();
                System.out.println("=> ingrese la cantidad de creditos ");
                int creditos = entrada.nextInt();
        
                float prom = 0;
                float sumatoria =0;
                for (float m = 1; m <= cantidad; m++) {
                    System.out.print(" -> ingrse la nota de la materia "+m+" : ");
                    float nota = entrada.nextFloat();
                    System.out.print(" -> ingrese los creditos "+m+" : ");
                    float credi = entrada.nextFloat();
        
                    sumatoria=sumatoria+credi;
                    prom=prom+ (nota*credi);
                    
                }
                float promedio =prom/sumatoria;
                System.out.println("total de creditos es: " + sumatoria);
                System.out.println("promedio del semestre es: " + promedio);
                
            }else if (tipo == 3) {
                System.out.println(" |------- Salir -------| ");
            }else{

            }
            
            
        }
    }
    
}
