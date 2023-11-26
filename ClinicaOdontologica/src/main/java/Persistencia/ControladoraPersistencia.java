/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moss_
 */
public class ControladoraPersistencia {
    
   HorarioJpaController horaJPA = new HorarioJpaController(); 
   OdontologoJpaController odontoJPA=new OdontologoJpaController();
   PacienteJpaController pacientJPA = new PacienteJpaController();
   PersonaJpaController perJPA = new PersonaJpaController();
   ResponsableJpaController respJPA = new ResponsableJpaController();
   SecretarioJpaController secreJPA = new SecretarioJpaController();
   TurnoJpaController turnJPA = new TurnoJpaController();
   UsuarioJpaController usuJPA = new UsuarioJpaController();

    public ControladoraPersistencia() {
    }
   
    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public List<Usuario> getUsuarios() {
        return usuJPA.findUsuarioEntities();
    }

    public void borrarUsuario(int id){
       try {
           usuJPA.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    public Usuario traerUsuario(int id) {
        return usuJPA.findUsuario(id);
    }  

    public void editarUsuario(Usuario usu) {
       try {
           usuJPA.edit(usu);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
