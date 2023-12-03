package model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Responsable extends Persona{
    
    private String tipoResponsabilidad;

    // Empty Constructor
    public Responsable() {
    }

    // Constructor with Parameters
    public Responsable(String tipoResponsabilidad, int id, String documentoIdentidad, String nombre, 
            String apellido, String telefono, String direccion, Date fechaNacimiento) {
        super(id, documentoIdentidad, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    // Getters and Setters
    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
}
