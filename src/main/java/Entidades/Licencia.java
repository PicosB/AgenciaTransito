/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "Licencia")
public class Licencia extends Tramite implements Serializable{
   
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaExpedicion")
    private Date fechaExpedicion;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaVigencia")
    private Date vigencia;
    
    @Basic
    @Column (name = "Años")
    private String anios;
    
    @Basic
    @Column (name = "Discapacitado")
    private String discapacitado;
     
    public Licencia() {
    }

    public Licencia(Date fechaExpedicion, Date vigencia, String anios, String discapacitado,String precio, Clientes cli) {
        super(precio, cli);
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.anios = anios;
        this.discapacitado = discapacitado;
    }

    public Licencia(Date fechaExpedicion, Date vigencia) {
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    public String getDiscapacitado() {
        return discapacitado;
    }

    public void setDiscapacitado(String discapacitado) {
        this.discapacitado = discapacitado;
    }
}
