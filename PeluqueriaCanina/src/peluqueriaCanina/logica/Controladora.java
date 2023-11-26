package peluqueriaCanina.logica;

import java.util.List;
import peluqueriaCanina.persistencia.ControladorPersistencia;

public class Controladora {

    ControladorPersistencia controlPersis = new ControladorPersistencia();

    

    public void guardar(String mascotaNombre, String raza, String color, 
            String alergico, String atencionEspecial, 
            String propietarioNombre, String contacto, String observaciones) {
        
        //Creacion de propietario                            
        Propietario propietario = new Propietario();
        propietario.setNombre(propietarioNombre);
        propietario.setContacto(contacto);
                            
        //Creacion de mascota
            Mascota mascota = new Mascota();
            mascota.setNombre(mascotaNombre);
            mascota.setRaza(raza);
            mascota.setColor(color);
            mascota.setAlergico(alergico);
            mascota.setAtencionEspecial(atencionEspecial);
            mascota.setObservaciones(observaciones);
            mascota.setUnPropietario(propietario);
                           
            controlPersis.guardar(propietario, mascota);
                            

    }    

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota, String mascotaNombre, String raza, String color, 
            String observaciones, String alergico, String atencionEspecial, String propietarioNombre, String contacto) {
        
        mascota.setNombre(mascotaNombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        
        //Modifico mascota
        controlPersis.modificarMascota(mascota);
        
        //Asignar nuevos valores al propietario
        Propietario propietario =  this.buscarPropietario(mascota.getUnPropietario().getIdProietario());
        propietario.setContacto(contacto);
        propietario.setNombre(propietarioNombre);
        
        //Llama a modificar al propietario
        this.modificarPropietario(propietario);
    }

    private Propietario buscarPropietario(int idProietario) {
        return controlPersis.traerPropietario(idProietario);
    }

    private void modificarPropietario(Propietario propietario) {
        controlPersis.modificarPropietario(propietario);
    }
}
