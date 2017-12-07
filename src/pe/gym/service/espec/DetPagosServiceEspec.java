/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import java.util.List;
import pe.gym.model.DetPagos;


/**
 *
 * @author Carlos
 */
public interface DetPagosServiceEspec extends CrudServiceSpec<DetPagos>{
    
    List<DetPagos> consultarDetPagos(String id);
    
    void CambiaEstado(String idPago, int nro);
   
    DetPagos compruebaEstado(String id, int nro);
    
}
