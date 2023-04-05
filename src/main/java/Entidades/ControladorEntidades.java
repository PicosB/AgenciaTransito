/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Persistencia.ControladorPersistencia;

/**
 *
 * @author PC
 */
public class ControladorEntidades {
    ControladorPersistencia controlPersis = new ControladorPersistencia();
    
    //---------------------------- Cliente-----------------------------
    public void guardarCliente(String RFC, String nombre, String apellidoP, String apellidoM, String fechaNacimiento, String numTelefono) {
        Clientes cl = new Clientes();
        
        cl.setRFC(RFC);
        cl.setNombres(nombre);
        cl.setApellidoP(apellidoP);
        cl.setApellidoM(apellidoM);
        cl.setFechaNacimiento(fechaNacimiento);
        cl.setNumTelefono(numTelefono);
        
        controlPersis.guardarCliente(cl);
    }
}
