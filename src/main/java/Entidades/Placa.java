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
import org.eclipse.persistence.annotations.PrimaryKey;

/**
 *
 * @author PC
 */
@Entity
@PrimaryKeyJoinColumn (name = "IdPlaca")
@DiscriminatorValue (value = "Placa")
@Table (name = "Placa")
public class Placa extends Tramite implements Serializable {
    /**
    * Atributp Codigo de la Placa
    */
    @Basic
    @Column (name = "Codigo")
    private String codigo;
    
    /**
     * Atributo Fecha Emision de la Placa
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaEmision")
    private Date fechaEmision;
    
    /**
     * Atributo Fecha Recepcion de la Placa
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaRecepcion")
    private Date fechaRecepcion;

    /**
     * Relacion con la Clase Vehiculo
     */
    @OneToOne
    private Vehiculo veh;
    
    /**
     * Metodo Constructor vacio de la clase
     */
    public Placa() {
    }

    /**
     * Metodo Constructor de la clase
     * @param codigo Codigo de la Placa
     * @param fechaEmision Fecha Emision de la Placa
     * @param fechaRecepcion Fecha Recepcion de la Placa
     * @param veh Vehiculo de la Placa
     * @param precio Precio de la Placa
     * @param cli Cliente de la Placa
     */
    public Placa(String codigo, Date fechaEmision, Date fechaRecepcion, Vehiculo veh, String precio, Clientes cli) {
        super(precio, cli);
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.veh = veh;
    }

    /**
     * Regresa el Codigo
     * @return El codigo de la Placa
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el Codigo
     * @param codigo El codigo de la Placa
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Regresa la Fecha de Emision
     * @return La fecha de emision de la Placa
     */
    public Date getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Establece la Fecha de Emision
     * @param fechaEmision La fecha de Emision de la Placa
     */
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Regresa la Fecha de Recepcion
     * @return La fecha de Recepcion de la Placa
     */
    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Establece la Fecha de Emision
     * @param fechaRecepcion La fecha de emision de la Placa
     */
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Regresa el vehiculo
     * @return El vehiculo de la Placa
     */
    public Vehiculo getVeh() {
        return veh;
    }

    /**
     * Establece el vehiculo
     * @param veh El vehiculo de la Placa
     */
    public void setVeh(Vehiculo veh) {
        this.veh = veh;
    }
}
