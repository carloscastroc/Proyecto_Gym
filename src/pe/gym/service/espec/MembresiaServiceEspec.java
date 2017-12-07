/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import java.util.List;
import pe.gym.model.Membresia;

/**
 *
 * @author Alumno
 */
public interface MembresiaServiceEspec extends CrudServiceSpec<Membresia>{
    
    List<Membresia> consultaMembresia(String dni);
    List<Membresia> compruebaestado(String idsocio);
    void congelarMembresia(String idmem, String ffinc, String estado );
    void insertaPago(String id, String idpago);
    List<Membresia> compruebaestadopago(String idmem);
    int congelamiento(String id);
    
}
