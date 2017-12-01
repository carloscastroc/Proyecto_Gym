/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.gym.model.Socio;
import pe.gym.service.espec.SocioServiceEspec;
import pe.gym.service.impl.SocioService;

/**
 *
 * @author Carlos
 */
public class PruebaConsultaSociosxDNI {

    public static void main(String[] args) {
        Socio bean = new Socio();

        List<Socio> lista = new ArrayList<>();
        String ap = "";
        SocioServiceEspec service = new SocioService();
        lista = service.consultarxape(ap);

        for (Socio r : lista) {
            System.out.println(r.getIdSocio()
                    + " - " + r.getNombre()
                    + " - " + r.getApellido()
                    + " - " + r.getDNI()
                    + " - " + r.getEmail()
                    + " - " + r.getF_inscripcion()
                    + " - " + r.getEstado());
        }
        
        

    }
}
