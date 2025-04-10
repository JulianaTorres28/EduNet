package ec.edu.ups.clases.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona{
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades +
                '}';
    }
}
