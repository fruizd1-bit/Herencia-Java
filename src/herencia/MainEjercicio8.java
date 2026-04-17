package herencia;

public class MainEjercicio8 {
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(5, 4);
        Circulo c = new Circulo(3);

        System.out.println("Area del rectangulo: " + r.calcularArea());
        System.out.println("Area del circulo: " + c.calcularArea());
    }
}

/*
Ejercicio 8: Figura, Rectangulo y Circulo

Aquí apliqué herencia, donde Rectangulo y Circulo heredan de Figura.

Sobrescribí el método calcularArea() en cada clase para que cada
figura tenga su propia forma de calcular el área.

Probé con un rectángulo y un círculo para verificar que los cálculos
sean correctos.
*/