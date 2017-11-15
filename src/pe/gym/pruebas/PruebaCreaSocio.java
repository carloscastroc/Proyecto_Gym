/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import pe.gym.model.Socio;
import pe.gym.service.espec.SocioServiceEspec;
import pe.gym.service.impl.SocioService;

/**
 *
 * @author Carlos
 */
public class PruebaCreaSocio {

    public static void main(String[] args) {
        try {
            // Dato

            Date ahora = new Date();

            String DATE_FORMAT = "yyyy/MM/dd";
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            String fec = sdf.format(ahora);
            System.out.println(fec);

            Socio bean = new Socio();

            bean.setIdEmpleado("E0001");
            bean.setNombre("Juan");
            bean.setApellido("Caceres");
            bean.setDNI(12345678);
            bean.setTelefono(1234567);
            bean.setEmail("alguncorreoxd@gmail.com");
            bean.setF_inscripcion(fec);
            bean.setEstado("");

            // Proceso
            SocioServiceEspec service;
            service = new SocioService();
            service.crear(bean);
            System.out.println("Socio creado con exito, su id es: " + bean.getIdSocio());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        };

    }

}
