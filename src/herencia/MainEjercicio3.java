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