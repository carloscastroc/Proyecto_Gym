/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import pe.gym.model.Empleado;
import pe.gym.service.impl.EmpleadoService;
import pe.gym.service.espec.EmpleadoServiceEspec;

/**
 *
 * @author Carlos
 */
public class PruebaLogin {

    public static void main(String[] args) {
        try {
            // Dato
            String usuario = "carlos";
            String clave = "castro";
            // Proceso
            EmpleadoServiceEspec service;
            service = new EmpleadoService();
            Empleado bean = service.validar(usuario, clave);
            System.out.println("Acceso OK.");
            System.out.println("Codigo: "+bean.getIdEmpleado());
            System.out.println("Nombre: "+bean.getNombre());
            System.out.println("Rol: "+bean.getIdCargo());
           
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

}
