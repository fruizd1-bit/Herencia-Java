package herencia;

public class MainEjercicio5 {
    public static void main(String[] args) {

        Empleado emp = new Empleado("Francisco Ruiz", 4000);
        Gerente gerente = new Gerente("Cristina Duran", 8000, 1500);

        System.out.println("=== EMPLEADO ===");
        emp.mostrar();

        System.out.println();

        System.out.println("=== GERENTE ===");
        gerente.mostrar();
    }
}