package Ejercicio1;

public class Profesor extends Empleado {
    private String cargo;
    private Boolean esProfesorOAyudante;

    // Constructor vacío
    public Profesor() {
        super(); // Llama al constructor vacío de la clase Empleado
    }

    // Constructor con parámetros
    public Profesor(int dni, String nombre, int edad, int cantidadMesesTrabajados, String cargo, Boolean esProfesorOAyudante) {
        super(dni, nombre, edad, cantidadMesesTrabajados);
        this.cargo = cargo;
        this.esProfesorOAyudante = esProfesorOAyudante;
    }

    // Getters y setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getEsProfesorOAyudante() {
        return esProfesorOAyudante;
    }

    public void setEsProfesorOAyudante(Boolean esProfesorOAyudante) {
        this.esProfesorOAyudante = esProfesorOAyudante;
    }

    // Implementación del método abstracto
    @Override
    public void ObtenerInformacionParticularDelTrabajo() {
        System.out.println("Los profesores suelen trabajar dando clases en secundarios, terciarios o universitarios");
    }
}