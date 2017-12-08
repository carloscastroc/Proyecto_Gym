/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
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
public class DetalleEvaluadorController {

    DetalleEvaluadorEspec service = new DetalleEvaluadorService();
    List<DetalleEvaluador> lista = new ArrayList<>();

    public List<DetalleEvaluador> Detalle(String idmem) {
        lista = service.Detalle(idmem);
        return lista;
    }
    
    public void crear(DetalleEvaluador bean){
        service.crear(bean);
    }

}
