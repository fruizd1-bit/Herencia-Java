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

/*
Ejercicio 2: Cuenta y CuentaCorriente

Aquí trabajé con herencia, donde CuentaCorriente hereda de Cuenta.

Sobrescribí el método retirar() para permitir sobregiro, validando
que no se pase del límite permitido.

Utilicé super para reutilizar el método retirar de la clase padre.

Probé retirando dinero dentro del límite y también un caso donde
se excede, para ver que funcione correctamente.
*/