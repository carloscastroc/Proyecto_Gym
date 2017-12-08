/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import java.util.List;
import pe.gym.model.EjercicioConsulta;

/**
 *
 * @author Carlos
 */
public interface EjercicioConsultaServiceEspec extends CrudServiceSpec<EjercicioConsulta>{
    
    List<EjercicioConsulta> consultaE(String nom);   
    
}
