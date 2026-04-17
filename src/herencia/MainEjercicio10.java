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

/*
Ejercicio 10: Sistema de Facturación

En este ejercicio apliqué herencia creando FacturaContado y
FacturaCredito a partir de la clase Factura.

Utilicé encapsulamiento en la clase Cliente usando atributos privados
y getters.

Sobrescribí el método calcularTotal() para aplicar descuento o recargo
según el tipo de factura.

También validé que el total no sea negativo.

Probé con una factura al contado y otra a crédito para verificar
los cálculos y resultados.
*/