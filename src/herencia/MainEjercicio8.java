package herencia;

public class MainEjercicio8 {
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(5, 4);
        Circulo c = new Circulo(3);

        System.out.println("Area del rectangulo: " + r.calcularArea());
        System.out.println("Area del circulo: " + c.calcularArea());
    }
}