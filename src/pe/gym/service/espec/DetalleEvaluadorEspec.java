/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import java.util.List;
import pe.gym.model.DetalleEvaluador;


/**
 *
 * @author JORGE LUIS
 */
public interface DetalleEvaluadorEspec extends CrudServiceSpec<DetalleEvaluador>{
    List<DetalleEvaluador> Detalle (String idmem);
}
