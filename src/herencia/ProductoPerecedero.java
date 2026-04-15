package herencia;

public class ProductoPerecedero extends Producto {

    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido() {
        // Fecha actual simulada (para la tarea)
        String fechaActual = "15/04/2026";

        // Comparación simple (solo para este ejercicio)
        if (fechaVencimiento.equals(fechaActual)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);

        if (estaVencido()) {
            System.out.println("Estado: VENCIDO");
        } else {
            System.out.println("Estado: VIGENTE");
        }
    }
}