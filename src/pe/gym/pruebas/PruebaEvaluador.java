/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.util.ArrayList;
import java.util.List;
import pe.gym.controller.EvaluadorConsultaController;
import pe.gym.model.EvaluadorConsulta;
import pe.gym.service.espec.EvaluadorConsultaEspec;
import pe.gym.service.impl.EvaluadorConsultaService;

/**
 *
 * @author JORGE LUIS
 */
public class PruebaEvaluador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EvaluadorConsulta bean = new EvaluadorConsulta();
        List<EvaluadorConsulta> lista = new ArrayList<>();
        String d="";
        EvaluadorConsultaEspec service = new EvaluadorConsultaService();
        lista= service.consultar(d);
        
        for(EvaluadorConsulta r: lista){
            System.out.println(r.getIdSocio()
                    + " - "+ r.getIdPlanEntrenamiento()
                    + " - "+ r.getIdInfNutricional()
                    + " - "+ r.getDNI()
                    + " - "+ r.getNombre()
                    + " - "+ r.getApellido());
        }
    }
    
}
