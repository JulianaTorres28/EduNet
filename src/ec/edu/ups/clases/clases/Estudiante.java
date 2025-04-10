package ec.edu.ups.clases.clases;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correoElectronico, String carrera) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
