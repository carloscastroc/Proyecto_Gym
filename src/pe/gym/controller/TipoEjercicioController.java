/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.TipoEjercicio;
import pe.gym.service.espec.TipoEjercicioEspec;
import pe.gym.service.impl.TipoEjercicioService;

/**
 *
 * @author JORGE LUIS
 */
public class TipoEjercicioController {
    TipoEjercicioEspec service = new TipoEjercicioService();
    List<TipoEjercicio> lista = new ArrayList<>();
    
    
}
