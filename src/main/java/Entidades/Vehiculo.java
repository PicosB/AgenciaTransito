/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "Vehiculo")
public class Vehiculo implements Serializable {

    /**
    * Atributo Identificador único del Vehiculo.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_Vehiculo")
    private Integer id;

    /**
    * Atributo Numero de Serie del Vehiculo.
    */
    @Basic
    @Column (name = "NumSerie")
    private String numSerie;
    
    /**
     * Atributo Marca del Vehiculo.
     */
    @Basic
    @Column (name = "Marca")
    private String marca;
    
    /**
     * Atributo Linea del Vehiculo.
     */
    @Basic
    @Column (name = "Linea")
    private String linea;
    
    /**
     * Atributo Modelo del Vehiculo.
     */
    @Basic
    @Column (name = "Modelo")
    private String modelo;
    
    /**
     * Atributo Color del Vehiculo.
     */
    @Basic
    @Column (name = "Color")
    private String color;
    
    /**
     * Atributo Tipo de Vehiculo del Vehiculo.
     */
    @Basic
    @Column (name = "TipoVehiculo")
    private String tipoVehiculo;
    
    /**
     * Relacion con el Cliente
     */
    @ManyToOne
    @JoinColumn (name = "IdCliente")
    private Clientes cli;
    
    /**
     * Metodo Constructor vacio de la clase.
     */
    public Vehiculo() {
    }

    /**
     * Metodo Constructor de la clase
     * @param id Id del Vehiculo.
     * @param numSerie Numero de serie del Vehiculo.
     * @param marca Marca del Vehiculo.
     * @param linea Linea del Vehiculo.
     * @param modelo Modelo del Vehiculo.
     * @param color Color del Vehiculo.
     * @param tipoVehiculo  Tipo de vehiculo del Vehiculo.
     */
    public Vehiculo(Integer id, String numSerie, String marca, String linea, String modelo, String color, String tipoVehiculo) {
        this.id = id;
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * Metodo Constructor de la clase
     * @param id Id del Vehiculo.
     * @param numSerie Numero de serie del Vehiculo.
     * @param marca Marca del Vehiculo.
     * @param linea Linea del Vehiculo.
     * @param modelo Modelo del Vehiculo.
     * @param color Color del Vehiculo.
     * @param tipoVehiculo  Tipo de vehiculo del Vehiculo.
     * @param cli Dueño del Vehiculo.
     */
    public Vehiculo(Integer id, String numSerie, String marca, String linea, String modelo, String color, String tipoVehiculo, Clientes cli) {
        this.id = id;
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.cli = cli;
    }
    
    /**
     * Regresa el Numero de Serie
     * @return El numero de Serie del Vehiculo.
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Establece el Numero de Serie
     * @param numSerie El numero de Serie del Vehiculo.
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Regresa la Marca
     * @return La marca del Vehiculo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la Marca
     * @param marca La marca del Vehiculo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Regresa la Linea
     * @return la linea del Vehiculo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la Linea
     * @param linea La linea del Vehiculo.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Regresa el Modelo
     * @return El modelo del Vehiculo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el Modelo
     * @param modelo El modelo del Vehiculo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Regresa el Color
     * @return El Color del Vehiculo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el Color
     * @param color El color del Vehiculo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Regresa el Id
     * @return El id del Vehiculo.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el Id
     * @param id El id del Vehiculo.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Regresa el Tipo de Vehiculo
     * @return El tipo de Vehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Establece el tipo de Vehiculo
     * @param tipoVehiculo 
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * Regresa el Dueño
     * @return El Dueño del Vehiculo.
     */
    public Clientes getCli() {
        return cli;
    }

    /**
     * Establece el Dueño
     * @param cli El dueño del Vehiculo.
     */
    public void setCli(Clientes cli) {
        this.cli = cli;
    }
}
