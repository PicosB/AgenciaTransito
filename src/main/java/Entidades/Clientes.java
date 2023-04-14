/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "Clientes")
public class Clientes implements Serializable {
    //Para ver si jala ya xd
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Cliente")
    private Integer id;
    
    @Basic
    @Column (name = "RFC")
    private String RFC;
    
    @Basic
    @Column (name = "Nombres")
    private String nombres;
    
    @Basic
    @Column (name = "ApellidoPaterno")
    private String apellidoP;
    
    @Basic
    @Column (name = "ApellidoMaterno")
    private String apellidoM;
    
    @Basic
    @Column (name = "NumeroTelefono")
    private String numTelefono;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaNacimiento")
    private Date fechaNacimiento;
    
    
    
    public Clientes() {
    }

    public Clientes(Integer id, String RFC, String nombres, String apellidoP, String apellidoM, String numTelefono, Date fechaNacimiento) {
        this.id = id;
        this.RFC = RFC;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
 
}
