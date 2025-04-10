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

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
