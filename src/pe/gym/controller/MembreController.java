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
    Membresia bean=new Membresia();
    String estado;
    
    public List<Membresia> consultaxdni(String dni){
        lista=service.consultaMembresia(dni);
        return lista;
    }
    
    
    public void RegistrarMembresia(Membresia bean) throws Exception {
        lista=service.compruebaestado(bean.getIdSocio());
        if(lista.size()>0){
            throw new Exception("Socio con una membresia activa o congelada");
        }
        service.crear(bean);
    }

    public void ModificaMembresia(Membresia bean) {
        service.modificar(bean);
    }
    
    public void creaCongelamiento(String id, String fechafc, String estado) throws Exception{
        lista=service.compruebaestadopago(id);
        if (!lista.isEmpty()) {
            throw new Exception("No ha generado el pago de esta membresia.");
        }
        int cont=service.congelamiento(id);
        if(cont>0){
            throw new Exception("Ya se ha creado un congelamiento a esta membresia");
        }
        service.congelarMembresia(id, fechafc, estado);
    }
    
    public List<Membresia> consultaestadopago(String id){
        lista=service.compruebaestadopago(id);
        return lista;
    }
    
    public Membresia leerxid(String id){
        bean=service.leerPorId(id);
        return bean;
    }
    
    public void insertaPago(String idm, String idpago){
        service.insertaPago(idm, idpago);
    }
    
    public String estadoultimamem(String id){
        estado=service.estadoultMembre(id);
        return estado;
    }
    
}
