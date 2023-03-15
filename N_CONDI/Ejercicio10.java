import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("ingrese nota de matematicas ");
        float nota1 = entrada.nextFloat();
        System.out.println("ingrese nota de español ");
        float nota2 = entrada.nextFloat();
        System.out.println("ingrese nota de ingles ");
        float nota3 = entrada.nextFloat();
        System.out.println("ingrese nota de ciencias naturales ");
        float nota4 = entrada.nextFloat();
        System.out.println("ingrese nota de deportes ");
        float nota5 = entrada.nextFloat();

        float suma= nota1 + nota2 + nota3 + nota4 + nota5;
        float prom = suma%5;
        //las notas que debe colocar como ejemplo es 1, 3, 4, 3 en ese orden debe colocar las notas como ejemplo en msql//

        if (nota1<nota2 && nota2>nota3 && nota3<nota4 && nota4>nota5 && nota5>nota1) {
            System.out.println("asignatura con mejor nota: " + nota4);
            System.out.println("asignatura con menor nota: " + nota1);
            System.out.println("promedio de notas: " + prom);
            System.out.println("debio tener una nota de 3.9 en ingles para aprobar: " + nota3);

                
        }    
        
    }
    
}
