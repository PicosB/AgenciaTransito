/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
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
@Table (name = "Usuario")
public class Usuarios implements Serializable {

    /**
    * Atributo Identificador único del Usuario.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Usuario")
    private Integer id;

    /**
     * Atributo nombre de usuario del Usuario.
     */
    @Basic
    @Column (name = "Usuario", nullable = false)
    private String nomUsuario;
    
    /**
     * Atributo contraseña del Usuario.
     */
    @Basic
    @Column (name = "Contraseña", nullable = false)
    private String contrasena;

    /**
     * Metodo Constructor vacio de la Clase
     */
    public Usuarios() {
    }

    /**
     * Metodo Constructor de la clase
     * @param id Id del Usuario.
     * @param nomUsuario Nombre usuario del Usuario.
     * @param contrasena Contraseña del Usuario.
     */
    public Usuarios(Integer id, String nomUsuario, String contrasena) {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.contrasena = contrasena;
    }

    /**
     * Regresa el Nombre de Usuario
     * @return El nombre de Usuario del Usuario.
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * Establece el Nombre de Usuario 
     * @param nomUsuario El nombre de usuario del Usuario.
     */
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    /**
     * Regresa la Contraseña
     * @return La contraseña del Usuario.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la Contraseña
     * @param contrasena La contraseña del Usuario.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    /**
     * Regresa el Id 
     * @return El Id del Usuario.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el Id
     * @param id El Id del Usuario.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
