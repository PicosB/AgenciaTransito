/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Clientes;
import Entidades.Usuarios;
import java.util.List;

/**
 *
 * @author PC
 */
public class ControladorPersistencia {
    ClientesJpaController cliJpa = new ClientesJpaController();
    UsuariosJpaController usuJpa = new UsuariosJpaController();
    
    public void guardarCliente(Clientes cl) {
        cliJpa.create(cl);
    }

    public List<Usuarios> traerUsuarios() {
        return usuJpa.findUsuariosEntities();
    }

    public void guardarUsuario(Usuarios usu) {
        usuJpa.create(usu);
    }
}
