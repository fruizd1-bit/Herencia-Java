package herencia;

public class MainEjercicio2 {
    public static void main(String[] args) {

        CuentaCorriente cuenta = new CuentaCorriente(1000, 500);

        System.out.println("=== CUENTA CORRIENTE ===");
        cuenta.mostrarSaldo();

        System.out.println("\nRetirando Q1200...");
        cuenta.retirar(1200);
        cuenta.mostrarSaldo();

        System.out.println("\nRetirando Q500...");
        cuenta.retirar(500);
        cuenta.mostrarSaldo();
    }
}