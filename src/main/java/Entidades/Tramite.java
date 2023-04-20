/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Tipo")
@Table (name = "Tramite")
public class Tramite implements Serializable {

    /**
    * Atributo Identificador único del Tramite.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    /**
     * Atributo Precio del Tramite.
     */
    @Basic
    @Column (name = "Precio")
    private String precio;

    /**
     * Relacion Cliente del Tramite.
     */
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cli;
    
    /**
     * Metodo Constructor vacio de la clase
     */
    public Tramite() {
    }

    /**
     * Metodo Constructor de la clase
     * @param precio Precio del Tramite.
     * @param cli Cliente del Tramite.
     */
    public Tramite(String precio, Clientes cli) {
        this.precio = precio;
        this.cli = cli;
    }
    
    /**
     * Regresa el Id del Tramite.
     * @return El Id del Tramite.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el Id del Tramite.
     * @param id El Id del Tramite.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * Regresa el Precio
     * @return El precio del Tramite.
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Establece el Precio
     * @param precio El precio del Tramite.
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Regresa el cliente
     * @return El cliente del Tramite. 
     */
    public Clientes getCli() {
        return cli;
    }

    /**
     * Establece el Cliente
     * @param cli El cliente del Tramite.
     */
    public void setCli(Clientes cli) {
        this.cli = cli;
    }
}
