package herencia;

public class MainEjercicio5 {
    public static void main(String[] args) {

        Empleado emp = new Empleado("Francisco Ruiz", 4000);
        Gerente gerente = new Gerente("Cristina Duran", 8000, 1500);

        System.out.println("=== EMPLEADO ===");
        emp.mostrar();

        System.out.println();

        System.out.println("=== GERENTE ===");
        gerente.mostrar();
    }
}

/*
Ejercicio 5: Empleado y Gerente

En este ejercicio apliqué herencia, ya que Gerente hereda de Empleado.

Sobrescribí el método calcularSalario() para agregar el bono
al salario del gerente.

El método mostrar() se reutiliza, pero muestra diferente resultado
gracias a la sobrescritura.

Probé con un empleado normal y un gerente para comparar resultados.
*/