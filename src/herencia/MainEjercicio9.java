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