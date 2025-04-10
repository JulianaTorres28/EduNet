package ec.edu.ups.clases.clases;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;
    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areasDeEspecializacion=" + areasDeEspecializacion +
                '}';
    }
}
