package model;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Secretario extends Persona{
    
    private String sector;
    @OneToOne
    private Usuario unUsuario;

    // Empty Constructor
    public Secretario() {
    }

    // Constructor with Parameters
    public Secretario(String sector, Usuario unUsuario, int id, String documentoIdentidad, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento) {
        super(id, documentoIdentidad, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }
    
    // Getters and Setters
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
}
