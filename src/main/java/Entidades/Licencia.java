/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
@PrimaryKeyJoinColumn(name ="IdLicencia")
@DiscriminatorValue (value = "Licencia")
@Table (name = "Licencia")
public class Licencia extends Tramite implements Serializable{
   
    /**
     * Atributo Fecha de Expedicion de la Licencia
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaExpedicion")
    private Date fechaExpedicion;
    
    /**
     * Atributo Fecha Vigencia de la Licencia
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaVigencia")
    private Date vigencia;
    
    /**
     * Atributo Años de la Licencia
     */
    @Basic
    @Column (name = "Años")
    private String anios;
    
    /**
     * Atributo Discapacitados de la Licencia
     */
    @Basic
    @Column (name = "Discapacitado")
    private String discapacitado;
    
    /**
     * Metodo Constructor Vacio de la clase.
     */
    public Licencia() {
    }

    /**
     * Metodo Constructor de la clase
     * @param fechaExpedicion Fecha Expedicion de la Licencia
     * @param vigencia Vigencia de la Licencia
     * @param anios Años de la Licencia
     * @param discapacitado Discapacitado de la Licencia
     * @param precio Precio de la Licencia
     * @param cli Cliente relacionado con la Licencia
     */
    public Licencia(Date fechaExpedicion, Date vigencia, String anios, String discapacitado,String precio, Clientes cli) {
        super(precio, cli);
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.anios = anios;
        this.discapacitado = discapacitado;
    }

    /**
     * 
     * @param fechaExpedicion Fecha Expedicion de la Licencia
     * @param vigencia Fecha Vigencia de la Licencia
     */
    public Licencia(Date fechaExpedicion, Date vigencia) {
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
    }

    /**
     * Regresa la Fecha de Expedicion
     * @return La fecha de Expedicion de la Licencia
     */
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Establece la Fecha de expedicion
     * @param fechaExpedicion La fecha de expedicion de la Licencia
     */
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Regresa la Fecha de Vigencia 
     * @return La fecha de vigencia de la Licencia
     */
    public Date getVigencia() {
        return vigencia;
    }

    /**
     * Establece la Fecha de Vigencia
     * @param vigencia La fecha de la vigencia de la Licencia
     */
    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Regresa los Años 
     * @return Los Años de la Licencia
     */
    public String getAnios() {
        return anios;
    }

    /**
     * Establece los Años
     * @param anios Los años de la Licencia
     */
    public void setAnios(String anios) {
        this.anios = anios;
    }

    /**
     * Regresa si es Discapacitado
     * @return Si es discapacitado
     */
    public String getDiscapacitado() {
        return discapacitado;
    }

    /**
     * Establece si es Discapacitado
     * @param discapacitado Si es Discapacitado
     */
    public void setDiscapacitado(String discapacitado) {
        this.discapacitado = discapacitado;
    }
}
