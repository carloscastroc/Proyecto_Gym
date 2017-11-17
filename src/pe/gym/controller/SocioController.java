/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;


import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Socio;
import pe.gym.service.espec.SocioServiceEspec;
import pe.gym.service.impl.SocioService;
import pe.gym.util.Session;

/**
 *
 * @author Carlos
 */
public class SocioController {
    SocioServiceEspec service = new SocioService();
    List<Socio> lista = new ArrayList<>();
    
    
    public void crearSocio(Socio bean){
        
        service.crear(bean);
       
    }
    
    public List<Socio> consultarxDNI(String dni){
        lista=service.consultar(dni);
        return lista;
    }
    
    public void modificarSocio(Socio bean){
        service.modificar(bean);
    }
    
}
