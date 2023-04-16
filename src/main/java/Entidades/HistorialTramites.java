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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luis
 */
@Entity
@Table (name = "historialTramites")
public class HistorialTramites implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column (name = "tipoTramite")
    private String tipoTramite; 
    @Basic
    @Column (name = "precio")
    private Float precioTramite;
    @Temporal (TemporalType.DATE)
    @Column (name = "fechaTramite")
    private Date fechaTramite;
    
    @Basic 
    @Column(name ="rfc_cliente") 
    private String rfcCliente;

    public HistorialTramites() {
    }

    public HistorialTramites(String tipoTramite, Float precioTramite, Date fechaTramite, String rfcCliente) {
        this.tipoTramite = tipoTramite;
        this.precioTramite = precioTramite;
        this.fechaTramite = fechaTramite;
        this.rfcCliente = rfcCliente;
    }


    public String getRfcCliente() {
        return rfcCliente;
    }

    public void setRfcCliente(String rfcCliente) {
        this.rfcCliente = rfcCliente;
    }
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Float getPrecio() {
        return precioTramite;
    }

    public void setPrecio(Float precio) {
        this.precioTramite = precio;
    }

    public Date getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Date fechaTramite) {
        this.fechaTramite = fechaTramite;
    }


    
}
