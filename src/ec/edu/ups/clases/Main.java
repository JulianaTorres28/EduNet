package ec.edu.ups.clases;

import ec.edu.ups.clases.clases.*;
import ec.edu.ups.clases.enums.Rol;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Institucion institucion1 = new Institucion(1, "Instituto Educativo A");
        Institucion institucion2 = new Institucion(2, "Instituto Educativo B");

        Persona estudiante = new Estudiante("0123434692", "Juan", "Pérez", "0953797542", "juanperez@gmail.com", "Computación");
        Persona docente = new Docente("012764765", "María", "Santos", "0987322234", "mariasantos23@gmail.com");
        Persona administrativo = new Administrativo("1125743789", "Martin", "Cedeño", "0965486275", "martincedeño23@gmail.com");
        Persona visitante = new Visitante("1123467422", "Laura", "Maurad", "0954756843", "lauramaurad@gmail.com", "Visita a un hijo", new GregorianCalendar(2025, 3, 9), new GregorianCalendar(2025, 3, 9));

        Asignacion asignacionEstudiante = new Asignacion(estudiante, new GregorianCalendar(2025, 4, 9), Rol.ESTUDIANTE);
        Asignacion asignacionDocente = new Asignacion(docente, new GregorianCalendar(2025, 4, 9), Rol.DOCENTE);

        Asignacion asignacionAdministrativo = new Asignacion(administrativo, new GregorianCalendar(2025, 4, 9), Rol.ADMINISTRATIVO);
        Asignacion asignacionVisitante = new Asignacion(visitante, new GregorianCalendar(2025, 4, 9), Rol.VISITANTE);

        institucion1.addAsignacion(asignacionEstudiante);
        institucion1.addAsignacion(asignacionDocente);
        institucion2.addAsignacion(asignacionAdministrativo);
        institucion2.addAsignacion(asignacionVisitante);

        System.out.println("Información de la Institución 1:");
        System.out.println(institucion1);

        System.out.println("\nInformación de la Institución 2:");
        System.out.println(institucion2);
    }
}

