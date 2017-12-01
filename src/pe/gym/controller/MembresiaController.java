/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Membresia;
import pe.gym.service.espec.MembresiaServiceEspec;
import pe.gym.service.impl.MembresiaService;

/**
 *
 * @author Carlos
 */
public class MembresiaController {

    MembresiaServiceEspec service = new MembresiaService();
    List<Membresia> lista = new ArrayList<>();

    public void RegistrarMembresia(Membresia bean) {

        service.crear(bean);

    }

    public void ModificaMembresia(Membresia bean) {
        service.modificar(bean);
    }

    public List<Membresia> consultarMembresiaxDNI(String dni) {
        service.consultaMembresia(dni);
        return lista;

    }

}
