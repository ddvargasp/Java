package persistence.persistence_controller;

import persistence.jpa_controller.TurnoJpaController;
import persistence.jpa_controller.ResponsableJpaController;
import persistence.jpa_controller.UsuarioJpaController;
import persistence.jpa_controller.OdontologoJpaController;
import persistence.jpa_controller.PacienteJpaController;
import persistence.jpa_controller.SecretarioJpaController;
import persistence.jpa_controller.PersonaJpaController;
import persistence.jpa_controller.HorarioJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import persistence.exceptions.NonexistentEntityException;

public class UsuarioControladoraPersistencia { 
    
    HorarioJpaController horarioJpaController = new HorarioJpaController();
    OdontologoJpaController odontologoJpaController = new OdontologoJpaController();
    PacienteJpaController pacienteJpaController = new PacienteJpaController();
    PersonaJpaController personaJpaController = new PersonaJpaController();
    ResponsableJpaController responsableJpaController = new ResponsableJpaController();
    SecretarioJpaController secretarioJpaController = new SecretarioJpaController();
    TurnoJpaController turnoJpaController = new TurnoJpaController();
    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();

    public UsuarioControladoraPersistencia() {
    }    

    public void crearUsuario(Usuario usu) {
        usuarioJpaController.create(usu);
    }

    public List<Usuario> getUsuarios() {
        return usuarioJpaController.findUsuarioEntities();
    }
    
    public void borrarUsuario(int id) {
        try {
            usuarioJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(UsuarioControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuarioJpaController.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuarioJpaController.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
