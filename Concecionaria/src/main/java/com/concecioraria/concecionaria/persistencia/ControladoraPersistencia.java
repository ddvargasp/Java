package com.concecioraria.concecionaria.persistencia;

import com.concecioraria.concecionaria.model.Vehiculo;
import com.concecioraria.concecionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    VehiculoJpaController vehiculoJpaController = new VehiculoJpaController();

    public void crearRegistroVehiculo(Vehiculo vehiculo) {
        
        vehiculoJpaController.create(vehiculo);
        
    }

    public List<Vehiculo> listarAutos() {
        return vehiculoJpaController.findVehiculoEntities();
        
    }

    public void borrarVehiculo(int idVehiculo) {
        try {
            vehiculoJpaController.destroy(idVehiculo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Vehiculo listarAutos(int idVehiculo) {
        return vehiculoJpaController.findVehiculo(idVehiculo);
    }

    public void modificarVehiculo(Vehiculo vehiculo) {
        try {
            vehiculoJpaController.edit(vehiculo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
