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

/*
Ejercicio 4: Transporte y Bus

Aquí utilicé herencia, donde Bus hereda de Transporte.

Se sobrescribió el método descripcion() para agregar la ruta,
usando super para no repetir código.

Probé con diferentes buses para verificar que muestre la
capacidad y la ruta correctamente.
*/