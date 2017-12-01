/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Promociones;
import pe.gym.service.espec.PromocionesServiceEspec;
import pe.gym.service.impl.PromocionesService;

/**
 *
 * @author Alumno
 */
public class PromocionesController {

    PromocionesServiceEspec service = new PromocionesService();
    List<Promociones> lista = new ArrayList<>();

    public List<Promociones> consultarxNombrep(String nompromocion) {
        lista = service.consultar(nompromocion);
        return lista;

    }

    public void crearPromocion(Promociones bean) {
        service.crear(bean);
    }
    
    public void modificarPromo(Promociones bean){
        service.modificar(bean);
    }
    
}
