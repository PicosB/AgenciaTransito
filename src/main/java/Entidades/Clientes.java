/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
    /**
    * Atributo Identificador único del Cliente.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Cliente")
    private Integer id;
    
    /**
    *Atributo RFC del cliente.
    */
    @Basic
    @Column (name = "RFC")
    private String RFC;
    
    /**
     * Atributo Nombre del cliente
     */
    @Basic
    @Column (name = "Nombres")
    private String nombres;
    
    /**
     * Atributo Apellido Paterno del cliente
     */
    @Basic
    @Column (name = "ApellidoPaterno")
    private String apellidoP;
    
    /**
     * Atributo Apellido Materno del cliente
     */
    @Basic
    @Column (name = "ApellidoMaterno")
    private String apellidoM;
    
    /**
     * Atributo Numero del cliente
     */
    @Basic
    @Column (name = "NumeroTelefono")
    private String numTelefono;
    
    /**
     * Atributo Fecha de Nacimiento
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "FechaNacimiento")
    private Date fechaNacimiento;
    
    /**
    * Lista de trámites realizados por el cliente.
    */
    @OneToMany (mappedBy = "cli", cascade = CascadeType.ALL)
    private List<Tramite> listaTramites;
    
    /**
    * La lista de vehículos registrados por el cliente    
    */
    @OneToMany (mappedBy = "cli", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Vehiculo> listaVehiculos;
    
    /**
     * Metodo Constructor vacio de la clase.
     */
    public Clientes() {
    }

    /**
     * Metodo constructor de la clase
     * @param id id del cliente
     * @param RFC RFC del cliente
     * @param nombres Nombre del cliente
     * @param apellidoP Apellido Paterno del cliente
     * @param apellidoM Apellido Materno del cliente
     * @param numTelefono Telefono del cliente
     * @param fechaNacimiento Fecha de Nacimiento del cliente
     */
    public Clientes(Integer id, String RFC, String nombres, String apellidoP, String apellidoM, String numTelefono, Date fechaNacimiento) {
        this.id = id;
        this.RFC = RFC;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    /**
     * Metodo Constructor de la clase sin Id del cliente
     * @param RFC RFC del cliente
     * @param nombres Nombre del cliente
     * @param apellidoP Apellido Paterno del cliente
     * @param apellidoM Apellido Materno del cliente
     * @param numTelefono Telefono del cliente
     * @param fechaNacimiento Fecha de Nacimiento del cliente
     */
   public Clientes( String RFC, String nombres, String apellidoP, String apellidoM, String numTelefono, Date fechaNacimiento) {
       
        this.RFC = RFC;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
    }

   /**
     * Metodo Constructor de la clase con Lista Tramites
     * @param id id del cliente
     * @param RFC RFC del cliente
     * @param nombres Nombre del cliente
     * @param apellidoP Apellido Paterno del cliente
     * @param apellidoM Apellido Materno del cliente
     * @param numTelefono Telefono del cliente
     * @param fechaNacimiento Fecha de Nacimiento del cliente
     * @param listaTramites Lista de trámites realizados por el cliente.
    */
    public Clientes(Integer id, String RFC, String nombres, String apellidoP, String apellidoM, String numTelefono, Date fechaNacimiento, List<Tramite> listaTramites) {
        this.id = id;
        this.RFC = RFC;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
        this.listaTramites = listaTramites;
    }

    /**
     * Metodo Constructor de la clase con Lista Tramites
     * @param id id del cliente
     * @param RFC RFC del cliente
     * @param nombres Nombre del cliente
     * @param apellidoP Apellido Paterno del cliente
     * @param apellidoM Apellido Materno del cliente
     * @param numTelefono Telefono del cliente
     * @param fechaNacimiento Fecha de Nacimiento del cliente
     * @param listaTramites Lista de tramites
     * @param listaVehiculos Lista de vehiculos
     */
    public Clientes(Integer id, String RFC, String nombres, String apellidoP, String apellidoM, String numTelefono, Date fechaNacimiento, List<Tramite> listaTramites, List<Vehiculo> listaVehiculos) {
        this.id = id;
        this.RFC = RFC;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
        this.listaTramites = listaTramites;
        this.listaVehiculos = listaVehiculos;
    }
    
    /**
     * Regresa el Id del Cliente
     * @return el Id del Cliente
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el Id del Cliente
     * @param id el Id del Cliente
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Regresa el RFC del Cliente
     * @return el RFC del Cliente
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * Establece el RFC del Cliente
     * @param RFC el RFC del Cliente
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * Regresa el Nombre del Cliente
     * @return el Nombre del Cliente
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los Nombres del Cliente
     * @param nombres los Nombres del Cliente
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Regresa el Apellido Paterno del Cliente
     * @return el Apellido Paterno del Cliente
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * Establece el Apellido Paterno del Cliente
     * @param apellidoP el Apellido Paterno del Cliente
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * Regresa el Apellido Materno del Cliente
     * @return el Apellido Materno del Cliente
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * Establece el Apellido Materno del Cliente
     * @param apellidoM el Apellido Materno del Cliente
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * Regresa el Numero de Telefono del Cliente
     * @return el Numero de Telefono del Cliente
     */
    public String getNumTelefono() {
        return numTelefono;
    }

    /**
     * Establece el Numero de Telefono del Cliente
     * @param numTelefono el Numero de telefono del Cliente
     */
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    /**
     * Regresa la Fecha de nacimiento del Cliente
     * @return la Fecha de nacimiento del Cliente
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del Cliente
     * @param fechaNacimiento la fecha de nacimiento del Cliente
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa la lista de tramites del Cliente
     * @return la lista de tramites del Cliente
     */
    public List<Tramite> getListaTramites() {
        return listaTramites;
    }

    /**
     * Establece la lista de tramites del Cliente
     * @param listaTramites la lista de tramites del Cliente
     */
    public void setListaTramites(List<Tramite> listaTramites) {
        this.listaTramites = listaTramites;
    }

    /**
     * Regresa la lista de vehiculos del Cliente
     * @return la lista de vehiculos del Cliente
     */
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    /**
     * Establece la lista de vehiculos del Cliente
     * @param listaVehiculos la lista de vehiculos del Cliente
     */
    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}
