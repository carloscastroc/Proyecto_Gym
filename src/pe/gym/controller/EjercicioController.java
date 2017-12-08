/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Ejercicio;
import pe.gym.model.EjercicioConsulta;
import pe.gym.service.espec.EjercicioConsultaServiceEspec;
import pe.gym.service.espec.EjercicioEspec;
import pe.gym.service.impl.EjercicioConsultaService;
import pe.gym.service.impl.EjercicioService;

/**
 *
 * @author JORGE LUIS
 */
public class EjercicioController {
    EjercicioEspec service = new EjercicioService();
    List<EjercicioConsulta> lista = new ArrayList<>();
    EjercicioConsultaServiceEspec servicec= new EjercicioConsultaService();
    
    public List<EjercicioConsulta> consultar(String nom){
        lista=servicec.consultaE(nom);
        return lista;
    }
    
    public void crear (Ejercicio bean){
        service.crear(bean);
    }
    
    public void eliminar(String id){
        service.eliminar(id);
    }
  
}
