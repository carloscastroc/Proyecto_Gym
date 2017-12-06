/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.EvaluadorConsulta;
import pe.gym.service.espec.EvaluadorConsultaEspec;
import pe.gym.service.impl.EvaluadorConsultaService;

/**
 *
 * @author JORGE LUIS
 */
public class EvaluadorConsultaController {

    EvaluadorConsultaEspec service = new EvaluadorConsultaService();
    List<EvaluadorConsulta> lista = new ArrayList<>();

    public List<EvaluadorConsulta> consultar(String dni) {
        lista = service.consultar(dni);
        return lista;
    }

}
