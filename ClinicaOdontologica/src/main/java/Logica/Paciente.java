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
public class Paciente extends Persona implements Serializable{
    //private int id_paciente;
    private boolean tien_OS;
    private String tipoSangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy="pacient")
    private List<Turno>listaTurnos;

    public Paciente() {
    }

    public Paciente(boolean tien_OS, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String dni, String nombre, String Apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, Apellido, telefono, direccion, fecha_nac);
        this.tien_OS = tien_OS;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

     

//    public int getId_paciente() {
//        return id_paciente;
//    }
//
//    public void setId_paciente(int id_paciente) {
//        this.id_paciente = id_paciente;
//    }

    public boolean isTien_OS() {
        return tien_OS;
    }

    public void setTien_OS(boolean tien_OS) {
        this.tien_OS = tien_OS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    
}
