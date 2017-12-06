/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import java.util.List;
import pe.gym.model.Ejercicio;

/**
 *
 * @author JORGE LUIS
 */
public interface EjercicioEspec extends CrudServiceSpec<Ejercicio>{
    List<Ejercicio> consultar();
    List<Ejercicio> consultarxtipo(String tipo);
}
