/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Clientes;
import Entidades.Licencia;
import Entidades.Placa;
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
    
    //------------ Clientes ----------------------
    public void guardarCliente(Clientes cl) {
        cliJpa.create(cl);
    }

    public List<Clientes> traerClientes() {
        return cliJpa.findClientesEntities();
    }
    
    public void borrarCliente(int id) {
        try {
            cliJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarCliente(Clientes cli) {
        try {
            cliJpa.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Clientes traerCliente(int id) {
        return cliJpa.findClientes(id);
    }
   
    //------------ Usuarios ----------------------
    public List<Usuarios> traerUsuarios() {
        return usuJpa.findUsuariosEntities();
    }

    public void guardarUsuario(Usuarios usu) {
        usuJpa.create(usu);
    }

    //------------ Licencias ----------------------

    public void guardarLicencia(Licencia lic) {
        licJpa.create(lic);
    }  

    public List<Licencia> traerLicencias() {
        return licJpa.findLicenciaEntities();
    }

    public Licencia traerLicencia(int id) {
        return licJpa.findLicencia(id);
    }

    public void renovarLicencia(Licencia lic) {
        try {
            licJpa.edit(lic);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //------------ Vehiculo ----------------------

    public void guardarVehiculo(Vehiculo veh) {
        vehJpa.create(veh);
    }

    
    //------------ Placas ----------------------
    
    public void guardarPlaca(Placa pl) {
        plaJpa.create(pl);
    }

    public List<Placa> traerPlacas() {
        return plaJpa.findPlacaEntities();
    }

    public Placa traerPlaca(int id) {
        return plaJpa.findPlaca(id);
    }

    public void renovarPlaca(Placa pl) {
        try {
            plaJpa.edit(pl);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
