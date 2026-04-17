package herencia;

public class MainEjercicio3 {
    public static void main(String[] args) {

        ProductoPerecedero producto1 = new ProductoPerecedero("Leche", 12.0, "15/04/2026");
        ProductoPerecedero producto2 = new ProductoPerecedero("Pan", 18.0, "20/04/2026");

        System.out.println("=== PRODUCTO 1 ===");
        producto1.mostrar();

        System.out.println();

        System.out.println("=== PRODUCTO 2 ===");
        producto2.mostrar();
    }
}

/*
Ejercicio 3: Producto y ProductoPerecedero

En este ejercicio apliqué herencia, ya que ProductoPerecedero
hereda de Producto.

Agregué un atributo de fecha de vencimiento y un método
estaVencido() para verificar el estado del producto.

También sobrescribí el método mostrar() para incluir la fecha
y si el producto está vencido o no.

Probé con un producto vencido y otro vigente.
*/