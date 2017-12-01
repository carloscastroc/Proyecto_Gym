/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.gym.controller.MembresiaController;
import pe.gym.model.Membresia;
import pe.gym.model.Socio;
import pe.gym.service.espec.MembresiaServiceEspec;
import pe.gym.service.espec.SocioServiceEspec;
import pe.gym.service.impl.MembresiaService;
import pe.gym.service.impl.SocioService;

/**
 *
 * @author Carlos
 */
public class PruebaConsultaMembresia {

    public static void main(String[] args) {
        Membresia bean = new Membresia();

        List<Membresia> lista = new ArrayList<>();
        String ap = "4";
        MembresiaServiceEspec service = new MembresiaService();
        lista = service.consultaMembresia(ap);

        for (Membresia r : lista) {
            System.out.println(r.getIdSocio()
                    + " - " + r.getIdEmpleado()
                    + " - " + r.getIdMembresia()
                    + " - " + r.getDNI()
                    + " - " + r.getIdMembresia()
                    + " - " + r.getIdPlan()
                    + " - " + r.getEstado());
        }
        
        

    }
}
