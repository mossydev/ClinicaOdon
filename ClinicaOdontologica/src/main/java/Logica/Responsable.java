/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author moss_
 */
@Entity
public class Responsable extends Persona{
    //private int id_responsable;
    private String tipoResp;

    public Responsable() {
    }

    public Responsable(String tipoResp, int id, String dni, String nombre, String Apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, Apellido, telefono, direccion, fecha_nac);
        this.tipoResp = tipoResp;
    }  

//    public int getId_responsable() {
//        return id_responsable;
//    }
//
//    public void setId_responsable(int id_responsable) {
//        this.id_responsable = id_responsable;
//    }

    public String getTipoResp() {
        return tipoResp;
    }

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }
    
    
}
