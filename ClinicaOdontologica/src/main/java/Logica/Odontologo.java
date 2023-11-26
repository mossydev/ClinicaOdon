/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author moss_
 */
@Entity
public class Odontologo extends Persona implements Serializable{
    //private int id_odontologo;
    private String especialidad;
    @OneToMany(mappedBy="odonto")
    private List<Turno>listaTurnos;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario unUsuario, Horario unHorario, int id, String dni, String nombre, String Apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, Apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

  
//    public int getId_odontologo() {
//        return id_odontologo;
//    }
//
//    public void setId_odontologo(int id_odontologo) {
//        this.id_odontologo = id_odontologo;
//    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
}
