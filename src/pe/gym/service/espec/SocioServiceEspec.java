/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;


import java.util.List;
import pe.gym.model.Socio;

/**
 *
 * @author Carlos
 */
public interface SocioServiceEspec extends CrudServiceSpec<Socio>{
    
    List<Socio> consultar(String DNI);
    List<Socio> consultarxape(String ape);
    
}
