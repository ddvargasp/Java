package controllers;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import persistence.persistence_controller.UsuarioControladoraPersistencia;

public class UsuarioController {
    
    UsuarioControladoraPersistencia usuarioControladoraPersistencia = new UsuarioControladoraPersistencia();

    public UsuarioController() {
    }
    
        
    public void crearUsuario (String nombreUsuario, String contrasenia, String rol) {
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        usuarioControladoraPersistencia.crearUsuario(usu);
    }

    public List<Usuario> getUsuarios() {
        return usuarioControladoraPersistencia.getUsuarios();
    }
    
    public void borrarUsuario(int id) {
        usuarioControladoraPersistencia.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return usuarioControladoraPersistencia.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        usuarioControladoraPersistencia.editarUsuario(usu);
    }

    public boolean validarUsuario(String usuario, String contrasenia) {
        
        boolean validar = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = usuarioControladoraPersistencia.getUsuarios();
        
        for(Usuario usu : listaUsuarios) {
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    validar = true;
                }
                else {
                    validar = false;
                }
        }
        }
        
        return validar;
    }
    
}
