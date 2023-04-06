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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "Clientes")
public class Clientes implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Cliente")
    private Integer id;
    
    @Basic
    @Column (name = "RFC", nullable = false)
    private String RFC;
    
    @Basic
    @Column (name = "Nombres", nullable = false)
    private String nombres;
    
    @Basic
    @Column (name = "ApellidoPaterno", nullable = false)
    private String apellidoP;
    
    @Basic
    @Column (name = "ApellidoMaterno", nullable = false)
    private String apellidoM;
    
    @Basic
    @Column (name = "NumeroTelefono", nullable = false)
    private String numTelefono;
    
    @Basic
    @Column (name = "FechaNacimiento", nullable = false)
    private String fechaNacimiento;

    @OneToMany
    private LinkedList<Vehiculo> listaVehiculos;
    
    
    public Clientes() {
    }

    public Clientes(Integer id, String RFC, String nombres, String apellidoP, String apellidoM, String numTelefono, String fechaNacimiento, LinkedList<Vehiculo> listaVehiculos) {
        this.id = id;
        this.RFC = RFC;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
        this.listaVehiculos = listaVehiculos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    
}
