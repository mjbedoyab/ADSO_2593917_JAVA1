import java.util.Scanner;

public class Textt2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        int count = 0;
        int i = 2;
        while (count < num) {
            if (isPrime(i)) {
                arr[count] = i;
                count++;
            }
            i++;
        }
        System.out.print("El arreglo de números primos es: ");
        for (int j = 0; j < num; j++) {
            System.out.print(arr[j] + " ");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

