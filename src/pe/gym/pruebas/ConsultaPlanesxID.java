/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import pe.gym.model.Planes;
import pe.gym.service.espec.PlanesServiceEspec;
import pe.gym.service.impl.PlanesService;

/**
 *
 * @author Carlos
 */
public class ConsultaPlanesxID {
        public static void main(String[] args) {
        try {
            PlanesServiceEspec service;
      service = new PlanesService();
      Planes bean = service.leerPorId("PLA03");
      System.out.println("Hola " + bean.getNombrePlan());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    }
    
}
