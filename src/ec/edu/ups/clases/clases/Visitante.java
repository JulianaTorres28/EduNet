package ec.edu.ups.clases.clases;

import java.util.Date;
import java.util.GregorianCalendar;

public class Visitante extends Persona {
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(String cedula, String nombre, String apellido, String telefono, String correoElectronico, String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.motivo = motivo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "motivo='" + motivo + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}
