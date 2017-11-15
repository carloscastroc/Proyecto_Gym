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
public class PruebaLeerxID {
    public static void main(String[] args) {
        try {
            EmpleadoServiceEspec service;
      service = new EmpleadoService();
      Empleado bean = service.leerPorId("E0002");
      System.out.println("Hola " + bean.getNombre());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    }
    
}
