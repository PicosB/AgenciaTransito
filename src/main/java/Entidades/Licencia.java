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
public class Licencia implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_Licencia")
    private Integer id_Licencia;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaExpedicion")
    private Date fechaExpedicion;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "Vigencia")
    private Date vigencia;
    
    @Basic
    @Column (name = "Años")
    private String anios;
    
    @Basic
    @Column (name = "Discapacitado")
    private String discapacitado;

    @Basic
    @Column (name = "Precio")
    private String precio;
    
    @OneToOne
    private Clientes cli;
    
    
    public Licencia() {
    }

    public Licencia(Integer id_Licencia, Date fechaExpedicion, Date vigencia, String anios, String discapacitado, String precio, Clientes cli) {
        this.id_Licencia = id_Licencia;
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.anios = anios;
        this.discapacitado = discapacitado;
        this.precio = precio;
        this.cli = cli;
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

    public Clientes getCli() {
        return cli;
    }

    public void setCli(Clientes cli) {
        this.cli = cli;
    }

    public String getDiscapacitado() {
        return discapacitado;
    }

    public void setDiscapacitado(String discapacitado) {
        this.discapacitado = discapacitado;
    }

    public Integer getId_Licencia() {
        return id_Licencia;
    }

    public void setId_Licencia(Integer id_Licencia) {
        this.id_Licencia = id_Licencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
