/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Planes;
import pe.gym.service.espec.PlanesServiceEspec;
import pe.gym.service.impl.PlanesService;

/**
 *
 * @author Alumno
 */
public class PruebaConsultaPlanes {
    
    public static void main(String[] args) {
        Planes bean = new Planes();

        List<Planes> lista = new ArrayList<>();
        String nomplan = "";
        PlanesServiceEspec service = new PlanesService();
        lista = service.consultar(nomplan);

        for (Planes r : lista) {
            System.out.println(r.getIdPlan()
                    + " - " + r.getIdEmpleado()
                    + " - " + r.getNombrePlan()
                    + " - " + r.getNroMeses()
                    + " - " + r.getImporte()
                    + " - " + r.getEstado());
        }
    }
    
}
