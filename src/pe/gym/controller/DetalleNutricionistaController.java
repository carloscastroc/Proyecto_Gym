/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.DetalleNutricionista;
import pe.gym.service.espec.DetalleNutricionistaEspec;
import pe.gym.service.impl.DetalleNutricionistaService;

/**
 *
 * @author Brayian
 */
public class DetalleNutricionistaController {
    
    DetalleNutricionistaEspec service =  new DetalleNutricionistaService();
    DetalleNutricionista bean = new DetalleNutricionista();
    List<DetalleNutricionista> lista = new ArrayList<>();
    
    public DetalleNutricionista leerxid(String id){
        bean=service.leerPorId(id);
        return bean;
    }
    
    public void crear(DetalleNutricionista bean){
        service.crear(bean);
    }
        
}
