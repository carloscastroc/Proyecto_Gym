/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import pe.gym.model.Membresia;
import pe.gym.service.espec.MembresiaServiceEspec;
import pe.gym.service.impl.MembresiaService;


/**
 *
 * @author Carlos
 */
public class MembresiaController {
    
    MembresiaServiceEspec service = new MembresiaService();
    
    public void RegistrarMembresia(Membresia bean){
        
        service.crear(bean);
        
    }
    
}
