package peluqueriaCanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Propietario implements Serializable {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idProietario;
	private String nombre;
	private String contacto;
	
	public Propietario() {
		super();
	}
        
	public Propietario(int idProietario, String nombre, String contacto) {
		super();
		this.idProietario = idProietario;
		this.nombre = nombre;
		this.contacto = contacto;
	}
        
	public int getIdProietario() {
		return idProietario;
	}
	public void setIdProietario(int idProietario) {
		this.idProietario = idProietario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	
}
