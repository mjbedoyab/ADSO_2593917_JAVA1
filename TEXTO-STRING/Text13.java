import java.util.Scanner;

public class Text13 {
    public static void main(String[] args) {
        
        Scanner post = new Scanner(System.in);

        System.out.print(" defina tamaño del arreglo ");
        int tama = post.nextInt();

        int arreglo [] = new int [tama];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i)+" => ");
            int item = post.nextInt();
            arreglo[i]=item;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();
        System.out.print("Ingrese la posicion a buscar: ");
        int posicion = post.nextInt();

        
        // Verificar si la posición excede el tamaño del arreglo
        if (posicion >= tama) {
            // Contar las posiciones de forma cíclica en sentido de las manecillas del reloj
            posicion = (posicion % tama)-1;
        } else if (posicion < 0) {
            // Contar las posiciones de forma cíclica en sentido contrario a las manecillas del reloj
            posicion = tama - (-posicion % tama);
        }

        // Mostrar el valor para la posición indicada
        System.out.println("Valor: " + arreglo[posicion]);
    }
    

}
