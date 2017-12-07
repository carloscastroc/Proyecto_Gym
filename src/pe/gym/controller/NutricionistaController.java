/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Nutricionista;
import pe.gym.service.espec.NutricionistaServiceEspec;
import pe.gym.service.impl.NutricionistaService;

/**
 *
 * @author Brayian
 */
public class NutricionistaController {
    
    NutricionistaServiceEspec service = new NutricionistaService();
    List<Nutricionista> lista = new ArrayList<>();
    
    public List<Nutricionista> consultarxDNI(String DNI){
        lista = service.consultar(DNI);
        return lista;
    }
}
