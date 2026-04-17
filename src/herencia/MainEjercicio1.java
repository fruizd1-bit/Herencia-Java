package herencia;

public class MainEjercicio1 {
    public static void main(String[] args) {

        Docente docente1 = new Docente("Fredy Ruiz", 19, "Programacion");
        Estudiante estudiante1 = new Estudiante("Karla Aguilar", 16, "0905-25-6514");

        System.out.println("=== DOCENTE ===");
        docente1.mostrar();

        System.out.println();

        System.out.println("=== ESTUDIANTE ===");
        estudiante1.mostrar();
    }
}

/*
Ejercicio 1: Persona, Docente y Estudiante

En este ejercicio utilicé herencia, ya que Docente y Estudiante
heredan de la clase Persona.

Usé super para enviar los datos al constructor de la clase padre,
y también sobrescribí el método mostrar() para agregar los datos
propios de cada clase.

Probé creando un docente y un estudiante para verificar que cada
uno muestre su información correctamente.
*/