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


        List<Membresia> lista = new ArrayList<>();
        String ap = "S00005";
        MembresiaServiceEspec service = new MembresiaService();
        lista = service.compruebaestado(ap);

        for (Membresia r : lista) {
            System.out.println(
                    r.getIdMembresia()
                    + " - " + r.getIdEmpleado()
                    + " - " + r.getIdSocio()
                    + " - " + r.getDNI()
                    + " - " + r.getNombre()
                    + " - " + r.getApellido()
                    + " - " + r.getIdPlan()
                    + " - " + r.getNombrePlan()
                    + " - " + r.getIdPromociones()
                    + " - " + r.getNombrePromocion()
                    + " - " + r.getIdPago()
                    + " - " + r.getF_Inicio()
                    + " - " + r.getF_Fin()
                    + " - " + r.getEstado());
        }

    }
}
