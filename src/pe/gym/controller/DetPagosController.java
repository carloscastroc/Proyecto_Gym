/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.DetPagos;
import pe.gym.service.espec.DetPagosServiceEspec;
import pe.gym.service.impl.DetPagosService;

/**
 *
 * @author Carlos
 */
public class DetPagosController {
    
    DetPagosServiceEspec service = new DetPagosService();
    List<DetPagos> lista = new ArrayList<>();
    DetPagos bean= new DetPagos();
    
    public List<DetPagos> consultaDetPagosxid (String id){
        lista=service.consultarDetPagos(id);
        return lista;
    }
    
    public void crear(DetPagos bean){
        service.crear(bean);
    }
    
    public void cambiaestadodetpago(String idp, int nro){
        service.CambiaEstado(idp, nro);
        
    }
    
    public DetPagos consultadetpago(String idp, int nro){
        bean=service.compruebaEstado(idp, nro);
       return  bean;
    }
    
}
