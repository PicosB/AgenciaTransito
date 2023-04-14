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
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "Vehiculo")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_Vehiculo")
    private Integer id;

    @Basic
    @Column (name = "NumSerie")
    private String numSerie;
    
    @Basic
    @Column (name = "Marca")
    private String marca;
    
    @Basic
    @Column (name = "Linea")
    private String linea;
    
    @Basic
    @Column (name = "Modelo")
    private String modelo;
    
    @Basic
    @Column (name = "Color")
    private String color;
    
    @Basic
    @Column (name = "TipoVehiculo")
    private String tipoVehiculo;
    
    public Vehiculo() {
    }

    public Vehiculo(Integer id, String numSerie, String marca, String linea, String modelo, String color, String tipoVehiculo) {
        this.id = id;
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
}
