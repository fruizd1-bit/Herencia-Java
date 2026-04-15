package herencia;

public class MainEjercicio10 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Fredy Ruiz", "34280560-6");

        FacturaContado fc = new FacturaContado(1, cliente, 1000, 10);
        FacturaCredito fcr = new FacturaCredito(2, cliente, 2500, 5, 5);

        System.out.println("=== FACTURA CONTADO ===");
        fc.mostrarFactura();

        System.out.println();

        System.out.println("=== FACTURA CREDITO ===");
        fcr.mostrarFactura();
        fcr.mostrarCuotas();
    }
}