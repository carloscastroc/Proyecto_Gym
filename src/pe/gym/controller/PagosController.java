/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Pagos;
import pe.gym.service.espec.PagosServiceEspec;
import pe.gym.service.impl.PagosService;

/**
 *
 * @author Carlos
 */
public class PagosController {
    
    PagosServiceEspec servicepagos = new PagosService();
    List<Pagos> lista = new ArrayList<>();
    
    public List<Pagos> consultaxPagodni(String dni){
        lista=servicepagos.consultarPagoxDNI(dni);
        return lista;
    }
    
    public void crear (Pagos bean){
        
        servicepagos.crear(bean);
    }
    
}
