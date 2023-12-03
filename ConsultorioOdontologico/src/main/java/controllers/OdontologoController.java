package controllers;

import java.util.List;
import model.Odontologo;
import persistence.persistence_controller.OdontologoControladoraPersistencia;

public class OdontologoController {
    
       OdontologoControladoraPersistencia odontologoControladoraPersistencia = new OdontologoControladoraPersistencia();

    public OdontologoController() {
    }

    public List<Odontologo> getOdontologos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crearOdontologo(String documentoIdentidad, String nombre, String apellido, String telefono,
            String direccion, String fechaNacimiento, String especialidad) {
        
        Odontologo odonto = new Odontologo();
        odonto.setDocumentoIdentidad(documentoIdentidad);
        odonto.setNombre(nombre);
        odonto.setApellido(apellido);
        odonto.setTelefono(telefono);
        odonto.setDireccion(direccion);
        //odonto.setFechaNacimiento(fechaNacimiento);
        odonto.setEspecialidad(especialidad);
        
        odontologoControladoraPersistencia.crearOdontologo(odonto);
    }
       
       
    
}
