/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Membresia;
import pe.gym.service.espec.MembresiaServiceEspec;
import pe.gym.service.impl.MembresiaService;

/**
 *
 * @author Carlos
 */
public class MembreController {
    
    MembresiaServiceEspec service= new  MembresiaService();
    List<Membresia> lista = new ArrayList<>();
    
    public List<Membresia> consultaxdni(String dni){
        lista=service.consultaMembresia(dni);
        return lista;
    }
    
    
    public void RegistrarMembresia(Membresia bean) throws Exception {
        lista=service.compruebaestado(bean.getIdSocio());
        if(lista.size()>0){
            throw new Exception("Socio con una membresia activa");
        }
        service.crear(bean);
    }

    public void ModificaMembresia(Membresia bean) {
        service.modificar(bean);
    }
    
}
