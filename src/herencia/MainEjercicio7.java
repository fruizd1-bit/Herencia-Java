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

/*
Ejercicio 7: Vehiculo y Moto

En este ejercicio usé herencia, ya que Moto hereda de Vehiculo.

Se agregó un nuevo atributo (cilindrada) y se sobrescribió
el método mostrarInfo() para incluir este dato.

Utilicé super para mostrar primero la información del vehículo
y luego la específica de la moto.

Probé con diferentes motos para verificar los datos.
*/