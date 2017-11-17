/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import pe.gym.model.Empleado;
import pe.gym.service.espec.EmpleadoServiceEspec;
import pe.gym.service.impl.EmpleadoService;
import pe.gym.util.Session;

/**
 *
 * @author Carlos
 */
public class EmpleadoController {
    
    public void validarUsuario(String usuario, String clave){
        EmpleadoServiceEspec service = new EmpleadoService();
        Empleado bean = service.validar(usuario, clave);
        Session.put("empleado", bean);
        
    }
    
    
}
