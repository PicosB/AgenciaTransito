/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import GUI.IniciarSesion;
import GUI.RegistroVehiculo;
import GUI.Tramites;
import Persistencia.ControladorPersistencia;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author PC
 */
public class ControladorEntidades {

    ControladorPersistencia controlPersis;

    public ControladorEntidades() {
        controlPersis = new ControladorPersistencia();
    }

    //---------------------------- Cliente-----------------------------
    public void guardarCliente(String RFC, String nombre, String apellidoP, String apellidoM, Date fechaNacimiento, String numTelefono, String discapacitado, Date fechaExp, Date fechaVig, String anios, String precio) {
        Clientes cl = new Clientes();
        cl.setRFC(RFC);
        cl.setNombres(nombre);
        cl.setApellidoP(apellidoP);
        cl.setApellidoM(apellidoM);
        cl.setFechaNacimiento(fechaNacimiento);
        cl.setNumTelefono(numTelefono);

        Licencia lic = new Licencia();
        lic.setDiscapacitado(discapacitado);
        lic.setFechaExpedicion(fechaExp);
        lic.setVigencia(fechaVig);
        lic.setAnios(anios);
        lic.setPrecio(precio);
        lic.setCli(cl);

        controlPersis.guardarCliente(cl);
        controlPersis.guardarLicencia(lic);
    }
     public void guardarClienteParaMasivo(String RFC, String nombre, String apellidoP, String apellidoM, String numTelefono, Date fechaNacimiento ) {
        Clientes cl = new Clientes();
        cl.setRFC(RFC);
        cl.setNombres(nombre);
        cl.setApellidoP(apellidoP);
        cl.setApellidoM(apellidoM);
        cl.setFechaNacimiento(fechaNacimiento);
        cl.setNumTelefono(numTelefono);


        controlPersis.guardarCliente(cl);
      
    }

    public List<Clientes> traerClientes() {
        return controlPersis.traerClientes();
    }

    public void borrarCliente(int id) {
        controlPersis.borrarCliente(id);
    }

    public void modificarCliente(Clientes cli, String RFC, String nombre, String apellidoP, String apellidoM, Date fechaNacimiento, String numTelefono) {
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

    public String validarCliente(String RFC) {
        List<Clientes> listaClientes = controlPersis.traerClientes();
        for (Clientes cli : listaClientes) {
            if (cli.getRFC().equals(RFC)) {
                RegistroVehiculo regVe = new RegistroVehiculo(listaClientes.get(0));
                regVe.setVisible(true);

            }
        }
        return RFC;
    }

    //---------------------------- Usuario -----------------------------
    public String validarUsuario(String usuario, String contrasena) {
        String mensaje = "";
        List<Usuarios> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuarios usu : listaUsuarios) {
            if (usu.getNomUsuario().equals(usuario)) {
                if (usu.getContrasena().equals(contrasena)) {
                    mensaje = "Usuario y Contraseña correctos. Bienvenido/a!";
                    new Tramites().setVisible(true);
                    return mensaje;
                } else {
                    mensaje = "Contraseña incorrecta, favor de ingresarla de nuevo";
                    return mensaje;
                }
            } else {
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

    //---------------------------- Licencia -----------------------------
    public List<Licencia> traerLicencias() {
        return controlPersis.traerLicencias();
    }

    public Licencia traerLicencia(int id) {
        return controlPersis.traerLicencia(id);
    }

    public void RenovarLicencia(Licencia lic, String discapacitado, Date fechaExp, Date fechaVig, String anios, String precio) {
        lic.setDiscapacitado(discapacitado);
        lic.setFechaExpedicion(fechaExp);
        lic.setVigencia(fechaVig);
        lic.setAnios(anios);
        lic.setPrecio(precio);

        controlPersis.renovarLicencia(lic);
    }

    //---------------------------- Placa -----------------------------
    public void guardarPlaca(String tipoVehiculo, String numSerie, String marca, String linea, String modelo, String color, String codigo, Date fechaEmi, Date fechaRece, String precio, Clientes cli) {
        Vehiculo veh = new Vehiculo();
        veh.setTipoVehiculo(tipoVehiculo);
        veh.setNumSerie(numSerie);
        veh.setMarca(marca);
        veh.setLinea(linea);
        veh.setModelo(modelo);
        veh.setColor(color);
        veh.setCli(cli);

        Placa pl = new Placa();
        pl.setCodigo(codigo);
        pl.setFechaEmision(fechaEmi);
        pl.setFechaRecepcion(fechaRece);
        pl.setPrecio(precio);
        pl.setVeh(veh);

        controlPersis.guardarVehiculo(veh);
        controlPersis.guardarPlaca(pl);
    }

    public List<Placa> traerPlacas() {
        return controlPersis.traerPlacas();
    }

    public Placa traerPlaca(int id) {
        return controlPersis.traerPlaca(id);
    }

    public void RenovarPlaca(Placa pl, Date fechaEmision, Date fechaRecepcion, String precio) {
        pl.setFechaEmision(fechaEmision);
        pl.setFechaRecepcion(fechaRecepcion);
        pl.setPrecio(precio);

        controlPersis.renovarPlaca(pl);
    }

    //---------------------------- Vehiculo -----------------------------
    public List<Vehiculo> traerVehiculos() {
        return controlPersis.traerVehiculos();
    }

    public void borrarVehiculo(int id) {
        controlPersis.borrarVehiculo(id);
    }

    public void buscarRFC(String RFC) {
        controlPersis.buscarRFC(RFC);
    }

    public void guardarEnHistorial(String tipoTramite, String precioTramite, Date fechaTramite, String rfcCliente) {
        HistorialTramites objTramite = new HistorialTramites();
        objTramite.setTipoTramite(tipoTramite);
        objTramite.setPrecio(precioTramite);
        objTramite.setFechaTramite(fechaTramite);
        objTramite.setRfcCliente(rfcCliente);

        controlPersis.guardarTramite(objTramite);
    }

    public List<HistorialTramites> traerTraamites() {
        return controlPersis.traerTramites();
    }

    public List<Tramite> traerTramites() {
        return controlPersis.traerTramite();
    }

    public List<HistorialTramites> filtrarHistorialLicencias(String RFC) {
        List<HistorialTramites> listaTramites = controlPersis.traerTramites();
        
        List<HistorialTramites> listaUsuarioRfc = new ArrayList<HistorialTramites>();
        for (int i = 0; i < listaTramites.size(); i++) {
            
            if (listaTramites.get(i).getRfcCliente().equalsIgnoreCase(RFC)) {

                listaUsuarioRfc.add(listaTramites.get(i));
               
               
            }
            
        }
        return listaUsuarioRfc;
    }
    
    public boolean validarClienteExistente(String rfc){
      List<Clientes> clientes =  controlPersis.traerClientes();
      
      for (int i=0; i<clientes.size(); i++){
          if(clientes.get(i).getRFC().equalsIgnoreCase(rfc)){
              return false;
          }
      }
      return true;
    }
    
     
}
