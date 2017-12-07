/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.util.ArrayList;
import java.util.List;
import pe.gym.controller.EvaluadorConsultaController;
import pe.gym.model.DetalleEvaluador;
import pe.gym.model.EvaluadorConsulta;
import pe.gym.service.espec.DetalleEvaluadorEspec;
import pe.gym.service.espec.EvaluadorConsultaEspec;
import pe.gym.service.impl.DetalleEvaluadorService;
import pe.gym.service.impl.EvaluadorConsultaService;

/**
 *
 * @author JORGE LUIS
 */
public class PruebaDetalleEvaluador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DetalleEvaluador bean = new DetalleEvaluador();
        List<DetalleEvaluador> lista = new ArrayList<>();
        String d="PE000001";
        DetalleEvaluadorEspec service = new DetalleEvaluadorService();
        lista= service.Detalle(d);
        
        for(DetalleEvaluador r: lista){
            System.out.println(r.getIdPlanEntrenamiento()
                    + " - "+ r.getEjercicio()
                    + " - "+ r.getN_Maquina()
                    + " - "+ r.getSerie()
                    + " - "+ r.getRepeticiones());
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
