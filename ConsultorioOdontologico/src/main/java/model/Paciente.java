package model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {
    
    private boolean seguroSocial;
    private String tipoSangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurnos;

    // Empty Constructor
    public Paciente() {
    }

    // Constructor with Parameters
    public Paciente(boolean seguroSocial, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, 
            int id, String documentoIdentidad, String nombre, String apellido, String telefono, String direccion, 
            Date fechaNacimiento) {
        super(id, documentoIdentidad, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.seguroSocial = seguroSocial;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    // Getters and Setters
    public boolean isSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(boolean seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
}
