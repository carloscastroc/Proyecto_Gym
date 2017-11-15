/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import pe.gym.model.Empleado;
import pe.gym.service.espec.EmpleadoServiceEspec;
import pe.gym.service.impl.EmpleadoService;

/**
 *
 * @author Carlos
 */
public class PruebaCreaEmpl {

    public static void main(String[] args) {
        try {
            // Dato
            Empleado bean = new Empleado();
            
            bean.setIdCargo("C0003");
            bean.setNombre("Juan");
            bean.setApellido("Gutierrez");
            bean.setDNI("12345678");
            bean.setDireccion("Algun lugar del mundo");
            bean.setTelefono(1234567);
            bean.setCorreo("alguncorreo@gmail.com");
            bean.setEstado("");
                       // Proceso
            EmpleadoServiceEspec service;
            service = new EmpleadoService();
            service.crear(bean);
            System.out.println("Empleado creado con exito, su id es: "+bean.getIdEmpleado());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        };

    }
}
