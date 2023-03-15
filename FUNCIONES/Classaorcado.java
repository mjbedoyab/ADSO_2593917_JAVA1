import java.util.Scanner;

public class Classaorcado {
    private String palabraSecreta;
    private String[] palabraMostrada;
    private int intentosRestantes;
    private boolean adivinado;

    public Classaorcado() {
        this.palabraSecreta = "";
        this.palabraMostrada = new String[0];
        this.intentosRestantes = 6;
        this.adivinado = false;
    }
    public void espacios() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public void ingresarPalabraSecreta(String palabra) {
        this.palabraSecreta = palabra.toUpperCase();
        this.palabraMostrada = new String[palabraSecreta.length()]; 
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraMostrada[i] = "_";
        }
    }

    public void start() {
        Scanner num = new Scanner(System.in);
        System.out.println("||--------------------------||");
        System.out.println("||                          ||");
        System.out.println("||                          ||");
        System.out.println("||     1. Iniciar juego     ||");
        System.out.println("||     2. Salir             ||");
        System.out.println("||                          ||");
        System.out.println("||                          ||");
        System.out.println("||--------------------------||");
        System.out.println(" => opcion ");
        int opcion=num.nextInt();
        do {

            if (opcion == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("¡Bienvenido al juego del Ahorcado!");
                System.out.println("Ingresa la palabra secreta:");
                ingresarPalabraSecreta(scanner.nextLine());
                this.espacios();

                while (!adivinado && intentosRestantes > 0) {
                    mostrarEstado();
                    System.out.println("Ingresa una letra:");
                    String letra = scanner.nextLine().toUpperCase();
                    if (letra.length() != 1) {
                        System.out.println("Debes ingresar una sola letra");
                        continue;
                    }
                    if (palabraSecreta.contains(letra)) {
                        for (int i = 0; i < palabraSecreta.length(); i++) {
                            if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                                palabraMostrada[i] = letra;
                            }
                        }
                        if (!String.join("", palabraMostrada).contains("_")) {
                            adivinado = true;
                            mostrarEstado();
                            System.out.println("¡Felicidades, has ganado!");
                        }
                    } else {
                        intentosRestantes--;
                        System.out.println("La letra no está en la palabra. Te quedan " + intentosRestantes + " intentos.");
                    }
                }

                if (!adivinado) {
                    System.out.println("Lo siento, has perdido. La palabra era " + palabraSecreta);
                }

                scanner.close();
                
            }else if (opcion == 2) {
                System.out.println("....... SALIENDO ........");
                
            }else{
                System.out.println("........... OPCION INVALIDA .........");

            }
            
            
        } while (opcion != 2);
        
    }

    private void mostrarEstado() {
        System.out.println("Palabra: " + String.join(" ", palabraMostrada));
        System.out.println("Intentos restantes: " + intentosRestantes);
    }
}
