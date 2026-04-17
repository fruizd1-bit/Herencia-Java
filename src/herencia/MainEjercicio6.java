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

/*
Ejercicio 6: Animal y Perro

Aquí trabajé con herencia, donde Perro hereda de Animal.

Sobrescribí el método hacerSonido() para que el perro tenga
un comportamiento diferente.

Probé ambos objetos para ver cómo cambia el resultado dependiendo
de la clase.
*/