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
@Table (name = "Placa")
public class Placa extends Tramite implements Serializable {
  
    @Basic
    @Column (name = "Codigo")
    private String codigo;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaEmision")
    private Date fechaEmision;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaRecepcion")
    private Date fechaRecepcion;

    @OneToOne
    private Vehiculo veh;
    
    public Placa() {
    }

    public Placa(String codigo, Date fechaEmision, Date fechaRecepcion, Vehiculo veh, String precio, Clientes cli) {
        super(precio, cli);
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.veh = veh;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Vehiculo getVeh() {
        return veh;
    }

    public void setVeh(Vehiculo veh) {
        this.veh = veh;
    }
}
