/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import GUI.IniciarSesion;
import GUI.Tramites;
import Persistencia.ControladorPersistencia;
import java.util.List;

/**
 *
 * @author PC
 */
public class ControladorEntidades {
    ControladorPersistencia controlPersis;

    public ControladorEntidades() {
        controlPersis  = new ControladorPersistencia();
    }
    
    
    
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

    //---------------------------- Usuario -----------------------------
    public String validarUsuario(String usuario, String contrasena) {
        String mensaje="";
        List<Usuarios> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuarios usu : listaUsuarios){
            if (usu.getNomUsuario().equals(usuario)){
                if (usu.getContrasena().equals(contrasena)){
                    mensaje = "Usuario y Contraseña correctos. Bienvenido/a!"; 
                    new Tramites().setVisible(true);
                    return mensaje;
                }else{
                    mensaje = "Contraseña incorrecta, favor de ingresarla de nuevo";
                    return mensaje;
                }
            }else{
                mensaje = "Usuario incorrecto/no se a encontrado...";
            }
        }
        return mensaje;
    }

    public void guardarUsuario(String Usuario, String Contrasena) {
        Usuarios usu = new Usuarios();
        
        usu.setNomUsuario(Usuario);
        usu.setContrasena(Contrasena);
        
        controlPersis.guardarUsuario(usu);
    }

    public List<Clientes> traerClientes() {
        return controlPersis.traerClientes();
    }

    public void borrarCliente(int id) {
        controlPersis.borrarCliente(id);
    }

    public void modificarCliente(Clientes cli, String RFC, String nombre, String apellidoP, String apellidoM, String fechaNacimiento, String numTelefono) {
        cli.setRFC(RFC);
        cli.setNombres(nombre);
        cli.setApellidoP(apellidoP);
        cli.setApellidoM(apellidoM);
        cli.setFechaNacimiento(fechaNacimiento);
        cli.setNumTelefono(numTelefono);
        
        controlPersis.modificarCliente(cli);
    }

    public Clientes traerCliente(int id) {
        return controlPersis.traerCliente(id);
    }
}
