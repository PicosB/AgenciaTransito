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

    /**
     * Atributo Identificador único del Historial Tramites.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    /**
    *Atributo Tipo de Tramite del Historial Tramites.
    */
    @Basic
    @Column (name = "tipoTramite")
    private String tipoTramite; 
    
    /**
     * Atributo Precio del Historial Tramites.
     */
    @Basic
    @Column (name = "precio")
    
    /**
     * Atributo Fecha Tramite del Historial Tramites.
     */
    private String precio;
    @Temporal (TemporalType.DATE)
    @Column (name = "fechaTramite")
    private Date fechaTramite;
    
    /**
     * Atributo RFC Cliente del Historial Tramites.
     */
    @Basic 
    @Column(name ="rfcCliente") 
    private String rfcCliente;

    /**
     * Metodo Constructor vacio de la clase.
     */
    public HistorialTramites() {
    }

    /**
     * Metodo constructor de la clase
     * @param tipoTramite Tipo de tramite del Historial Tramites.
     * @param precioTramite Precio del tramite del Historial Tramites.
     * @param fechaTramite Fecha del tramite del Historial Tramites.
     * @param rfcCliente RFC Cliente del Historial Tramites.
     */
    public HistorialTramites(String tipoTramite, String precioTramite, Date fechaTramite, String rfcCliente) {
        this.tipoTramite = tipoTramite;
        this.precio = precioTramite;
        this.fechaTramite = fechaTramite;
        this.rfcCliente = rfcCliente;
    }

    /**
    * Regresa el RFC Cliente del Historial Tramites.
    * @return RFC Cliente del Historial Tramites.
    */
    public String getRfcCliente() {
        return rfcCliente;
    }

    /**
     * Establece el RFC Cliente del Historial Tramites.
     * @param rfcCliente 
     */
    public void setRfcCliente(String rfcCliente) {
        this.rfcCliente = rfcCliente;
    }

    /**
     * Regresa el Id del Historial Tramites.
     * @return el id del Historial Tramites.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el Id del Historial Tramites.
     * @param id el id del Historial Tramites.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Regresa el Tipo de Tramite
     * @return el Tipo de tramite del Historial Tramites.
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Establece el tipo de Tramite
     * @param tipoTramite el Tipo de tramite del Historial Tramites.
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    /**
     * Regresa el Precio
     * @return el precio del Historial Tramites.
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Establece el Precio
     * @param precio el Precio del Historial Tramites.
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Regresa la Fecha del Tramite
     * @return la Fecha del Tramite del Historial Tramites.
     */
    public Date getFechaTramite() {
        return fechaTramite;
    }

    /**
     * Establece la Fecha 
     * @param fechaTramite la fecha del Historial Tramites. 
     */
    public void setFechaTramite(Date fechaTramite) {
        this.fechaTramite = fechaTramite;
    }
}
