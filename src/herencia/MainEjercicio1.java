package herencia;

public class MainEjercicio1 {
    public static void main(String[] args) {

        Docente docente1 = new Docente("Fredy Ruiz", 19, "Programacion");
        Estudiante estudiante1 = new Estudiante("Karla Aguilar", 16, "0905-25-6514");

        System.out.println("=== DOCENTE ===");
        docente1.mostrar();

        System.out.println();

        System.out.println("=== ESTUDIANTE ===");
        estudiante1.mostrar();
    }
}