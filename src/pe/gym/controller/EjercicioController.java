/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.controller;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Ejercicio;
import pe.gym.service.espec.EjercicioEspec;
import pe.gym.service.impl.EjercicioService;

/**
 *
 * @author JORGE LUIS
 */
public class EjercicioController {
    EjercicioEspec service = new EjercicioService();
    List<Ejercicio> lista = new ArrayList<>();
}
