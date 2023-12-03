package com.concecioraria.concecionaria.controller;

import com.concecioraria.concecionaria.model.Vehiculo;
import com.concecioraria.concecionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void crearRegistro(String modelo, String marca, String motor, String color, String patente, int cantidadPuertas) {
        
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setModelo(modelo);
        vehiculo.setMarca(marca);
        vehiculo.setMotor(motor);
        vehiculo.setColor(color);
        vehiculo.setPatente(patente);
        vehiculo.setCantidadPuertas(cantidadPuertas);
        
        controladoraPersistencia.crearRegistroVehiculo(vehiculo);
    }

    public List<Vehiculo> listarVehiculos() {
        
        return controladoraPersistencia.listarAutos();
    }

    public void eliminarVehiculo(int idVehiculo) {
        controladoraPersistencia.borrarVehiculo(idVehiculo);
    }

    public Vehiculo listarVehiculos(int idVehiculo) {
        return controladoraPersistencia.listarAutos(idVehiculo);
    }

    public void modificarVehiculo(Vehiculo vehiculo, String modelo, String marca, String motor, String color, String patente, int cantidadPuertas) {
        
        vehiculo.setModelo(modelo);
        vehiculo.setMarca(marca);
        vehiculo.setMotor(motor);
        vehiculo.setColor(color);
        vehiculo.setPatente(patente);
        vehiculo.setCantidadPuertas(cantidadPuertas);
        
        controladoraPersistencia.modificarVehiculo(vehiculo);
    }

}
