package peluqueriaCanina.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import peluqueriaCanina.logica.Mascota;
import peluqueriaCanina.logica.Propietario;
import peluqueriaCanina.persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {

    PropietarioJpaController propietarioJpa = new PropietarioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();   
    
    public void guardar(Propietario propietario, Mascota mascota){
        
        //Crear en la BD al propietario
        propietarioJpa.create(propietario);
        
        //Crear en la BD la mascota
        mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        return mascotaJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Propietario traerPropietario(int idProietario) {
        return propietarioJpa.findPropietario(idProietario);
    }

    public void modificarPropietario(Propietario propietario) {
        try {
            propietarioJpa.edit(propietario);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
