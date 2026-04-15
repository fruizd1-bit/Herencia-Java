package herencia;

public class MainEjercicio4 {
    public static void main(String[] args) {

        Bus bus1 = new Bus(40, "Jutiapa - Guatemala");
        Bus bus2 = new Bus(30, "Jutiapa - El Progreso");

        System.out.println("=== BUS 1 ===");
        bus1.descripcion();

        System.out.println();

        System.out.println("=== BUS 2 ===");
        bus2.descripcion();
    }
}