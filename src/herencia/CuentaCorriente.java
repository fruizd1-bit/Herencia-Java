package herencia;

public class CuentaCorriente extends Cuenta {

    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }
    @Override
    public void retirar(double monto) {
        if (saldo + limiteSobregiro >= monto) {
            super.retirar(monto);
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Fondos insuficientes, supera el limite de sobregiro.");
        }
    }
}