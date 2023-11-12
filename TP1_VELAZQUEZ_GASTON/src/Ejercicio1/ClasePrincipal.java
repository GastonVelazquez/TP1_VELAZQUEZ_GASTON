// ClasePrincipal.java
package Ejercicio1;

public class ClasePrincipal {
    public static void main(String[] args) {
        // Instancia de Profesor con constructor que tiene todos los atributos
        Profesor profesor1 = new Profesor(123456789, "Juan Perez", 35, 10, "Profesor", true);
        System.out.println("Información del Profesor:");
        System.out.println(profesor1.toString());
        profesor1.EvaluarCantidadMesesTrabajados();

        // Instancia de Profesor con constructor vacío
        Profesor profesor2 = new Profesor();
        System.out.println("\nInformación del Profesor con constructor vacío:");
        System.out.println(profesor2.toString());
        profesor2.EvaluarCantidadMesesTrabajados();

        // Llamada al método ObtenerInformacionParticularDelTrabajo()
        System.out.println("\nInformación particular del trabajo:");
        profesor2.ObtenerInformacionParticularDelTrabajo();
    }
}