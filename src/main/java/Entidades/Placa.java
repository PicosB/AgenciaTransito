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
public class Placa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_Placa")
    private Integer id_Placa;
    
    @Basic
    @Column (name = "Codigo")
    private String codigo;
    
    @Basic
    @Column (name = "Precio")
    private String precio;
    
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

    public Placa(Integer id_Placa, String codigo, String precio, Date fechaEmision, Date fechaRecepcion, Vehiculo veh) {
        this.id_Placa = id_Placa;
        this.codigo = codigo;
        this.precio = precio;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.veh = veh;
    }

    public Integer getId_Placa() {
        return id_Placa;
    }

    public void setId_Placa(Integer id_Placa) {
        this.id_Placa = id_Placa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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
