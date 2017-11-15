/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import pe.gym.model.Empleado;

/**
 *
 * @author Carlos
 */
public interface EmpleadoServiceEspec extends CrudServiceSpec<Empleado>{
    
    Empleado validar(String usuario, String clave);
    
}
