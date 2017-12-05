/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Planes;
import pe.gym.service.espec.PlanesServiceEspec;
import pe.gym.service.impl.PlanesService;

/**
 *
 * @author Alumno
 */
public class PlanesController {
    PlanesServiceEspec service = new PlanesService();
    List<Planes> lista = new ArrayList<>();
    Planes bean= new Planes();
    

     public List<Planes> consultarxNombre(String nomplan){
        lista=service.consultar(nomplan);
        return lista;
    }
     
     public void crearPlan(Planes bean){
         service.crear(bean);
     }
   
     public void modificarPlan(Planes bean){
         service.modificar(bean);
     }
    
    public Planes leerxid(String id){
        bean=service.leerPorId(id);
        return bean;
    }
    
}
