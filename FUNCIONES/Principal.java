
public class Principal {
    public static void main(String[] args) {
        
        // instancia de la persona

        Persona lista[]=new Persona[10];

        lista[0] = new Persona();
        lista[1] = new Persona(108800, "jhon alber", "aricapa pinto", "masculino", 17, 50000, 160);
        lista[2] = new Persona(108801, "juan david", "monsalve");

        lista[0].imprimirCartaPresentacion();
        lista[1].imprimirCartaPresentacion();
        lista[2].imprimirCartaPresentacion();

        
    }
    
}
