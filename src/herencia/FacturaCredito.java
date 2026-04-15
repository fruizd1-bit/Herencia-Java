package herencia;

public class FacturaCredito extends Factura {

    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public double calcularTotal() {
        double totalFinal = total + (total * recargo / 100);

        if (totalFinal < 0) {
            return 0;
        }

        return totalFinal;
    }

    public void mostrarCuotas() {
        double pago = calcularTotal() / cuotas;
        System.out.println("Cuotas: " + cuotas);
        System.out.println("Pago por cuota: Q" + pago);
    }
}