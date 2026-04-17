package herencia;

public class MainEjercicio9 {
    public static void main(String[] args) {

        Libro libro = new Libro("Mil años de soledad", "Helber Chavez");
        LibroDigital ebook = new LibroDigital("Java Basico", "Beto Leiva", 9.5);

        System.out.println("=== LIBRO FISICO ===");
        libro.mostrarInfo();

        System.out.println();

        System.out.println("=== LIBRO DIGITAL ===");
        ebook.mostrarInfo();
    }
}

/*
Ejercicio 9: Libro y LibroDigital

En este ejercicio utilicé herencia, ya que LibroDigital hereda de Libro.

Se agregó un atributo adicional (tamaño en MB) y se sobrescribió
el método mostrarInfo() para incluir esta información.

Utilicé super para mostrar primero los datos del libro.

Probé con un libro físico y uno digital.
*/