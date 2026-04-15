package herencia;

public class MainEjercicio6 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Perro perro = new Perro();

        System.out.println("=== ANIMAL ===");
        animal.hacerSonido();

        System.out.println();

        System.out.println("=== PERRO ===");
        perro.hacerSonido();
    }
}