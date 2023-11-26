/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moss_
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearUsuario(String nombreUsuario,String contrasenia,String rol){
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);    
    }

    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
    }
    
    public void borrarUsuario(int id) {
         controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
        boolean ingreso=false;
        
        List<Usuario>listaUsuarios=new ArrayList<>();
        listaUsuarios=controlPersis.getUsuarios();
        
        for(Usuario usu:listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    ingreso=true;
                }else{
                    ingreso=false;
                }
            }
        }
        return ingreso;
    }
}
