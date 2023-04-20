/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Clientes;
import Entidades.HistorialTramites;
import Entidades.Licencia;

import Entidades.Placa;
import Entidades.Tramite;
import Entidades.Usuarios;
import Entidades.Vehiculo;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ControladorPersistencia {
    ClientesJpaController cliJpa = new ClientesJpaController();
    UsuariosJpaController usuJpa = new UsuariosJpaController();
    LicenciaJpaController licJpa = new LicenciaJpaController();
    PlacaJpaController plaJpa = new PlacaJpaController();
    VehiculoJpaController vehJpa = new VehiculoJpaController();
    HistorialTramitesJpaController ht = new HistorialTramitesJpaController();
    TramiteJpaController trJpa = new TramiteJpaController();
    
    //------------ Clientes ----------------------
    /**
     * Metodo para guardar Cliente
     * @param cl 
     */
    public void guardarCliente(Clientes cl) {
        cliJpa.create(cl);
    }

    /**
     * Metodo para traer lista de clientes
     * @return 
     */
    public List<Clientes> traerClientes() {
        return cliJpa.findClientesEntities();
    }
    
    /**
     * Metodo para borrar clientes
     * @param id 
     */
    public void borrarCliente(int id) {
        try {
            cliJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo para modificar Clientes
     * @param cli 
     */
    public void modificarCliente(Clientes cli) {
        try {
            cliJpa.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo para traer un cliente
     * @param id
     * @return 
     */
    public Clientes traerCliente(int id) {
        return cliJpa.findClientes(id);
    }
    
    /**
     * Metodo para buscar un Cliente por RFC
     * @param RFC 
     */
    public void buscarRFC(String RFC) {
        cliJpa.findClientes(RFC);
    }
    //------------ Usuarios ----------------------
    /**
     * Metodo para traer lista de usuarios
     * @return 
     */
    public List<Usuarios> traerUsuarios() {
        return usuJpa.findUsuariosEntities();
    }

    /**
     * Metodo para guardar usuario
     * @param usu 
     */
    public void guardarUsuario(Usuarios usu) {
        usuJpa.create(usu);
    }

    //------------ Licencias ----------------------

    /**
     * Metodo para guardar licencia
     * @param lic 
     */
    public void guardarLicencia(Licencia lic) {
        licJpa.create(lic);
    }  

    /**
     * Metodo para traer lista de licencias
     * @return 
     */
    public List<Licencia> traerLicencias() {
        return licJpa.findLicenciaEntities();
    }

    public Licencia traerLicencia(int id) {
        return licJpa.findLicencia(id);
    }

    /**
     * Metodo para renovar licencia
     * @param lic 
     */
    public void renovarLicencia(Licencia lic) {
        try {
            licJpa.edit(lic);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //------------ Vehiculo ----------------------

    /**
     * Metodo para guardar Vehiculo
     * @param veh 
     */
    public void guardarVehiculo(Vehiculo veh) {
        vehJpa.create(veh);
    }
    
    /**
     * Metodo para validar por numero de serie el vehiculo
     * @param numSerie
     * @return 
     */
    public boolean validarPorSerie (String numSerie){
        if(vehJpa.buscarPorSerie(Integer.valueOf(numSerie))!=null){
            return true;
        }else{
            return false;
        }
         
    }
    
    /**
     * Metodo para traer lista de vehiculos
     * @return 
     */
    public List<Vehiculo> traerVehiculos() {
        return vehJpa.findVehiculoEntities();
    }

    /**
     * Metodo para borrar vehiculos
     * @param id 
     */
    public void borrarVehiculo(int id) {
        try {
            vehJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //------------ Placas ----------------------
    
    /**
     * Metodo para guardar placa
     * @param pl 
     */
    public void guardarPlaca(Placa pl) {
        plaJpa.create(pl);
    }

    /**
     * Metodo para traer lista de placas
     * @return 
     */
    public List<Placa> traerPlacas() {
        return plaJpa.findPlacaEntities();
    }

    /**
     * Metodo para traer una placa
     * @param id
     * @return 
     */
    public Placa traerPlaca(int id) {
        return plaJpa.findPlaca(id);
    }

    /**
     * Metodo para renovar una placa
     * @param pl 
     */
    public void renovarPlaca(Placa pl) {
        try {
            plaJpa.edit(pl);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //------- Historial Tramites
    /**
     * Metodo para guardar un tramite
     * @param ht 
     */
    public void guardarTramite(HistorialTramites ht) {
        this.ht.create(ht);
        
    }

    /**
     * Metodo para traer una lista de tramites
     * @return 
     */
    public List<Tramite> traerTramite() {
        return trJpa.findTramiteEntities();
    }
    
    /**
     * Metodo para traer una lista de Historial de tramites
     * @return 
     */
    public List<HistorialTramites> traerTramites() {
        return ht.findHistorialTramitesEntities();
    }
    
   
    
}
