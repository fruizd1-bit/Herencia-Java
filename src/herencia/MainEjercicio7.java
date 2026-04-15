package herencia;

public class MainEjercicio7 {
    public static void main(String[] args) {

        Moto moto1 = new Moto("Yamaha", 300, 600);
        Moto moto2 = new Moto("Honda", 199, 300);

        System.out.println("=== MOTO 1 ===");
        moto1.mostrarInfo();

        System.out.println();

        System.out.println("=== MOTO 2 ===");
        moto2.mostrarInfo();
    }
}