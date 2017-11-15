/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import java.util.List;

/**
 *
 * @author Carlos
 */
public interface CrudServiceSpec<T> {
    
    void crear(T bean);
  
  void modificar(T bean);
  
 
  T leerPorId(String id);
  
  
    
}
