package ec.edu.ups.clases.clases;

import ec.edu.ups.clases.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion(){
        this.sedes = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    public Institucion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    public Direccion getDireccion(){return direccion;}

    public void addDireccion(TipoDireccion tipoDireccion, String callePrincipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais) {
        this.direccion = new Direccion(tipoDireccion, callePrincipal, calleSecundaria, numeracion, ciudad, provincia, pais);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addSede(String sede){
        sedes.add(sede);
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void addAsignacion(Asignacion asignacion){
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
