/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import pe.gym.controller.MembreController;
import pe.gym.controller.SocioController;
import pe.gym.model.Membresia;
import pe.gym.model.Socio;
import pe.gym.util.CreaAcuerdo;

/**
 *
 * @author Carlos
 */
public class Pruebapdf {
    
    public static void main(String[] args) {
        MembreController mem=new MembreController();
        SocioController soc= new SocioController();
        Membresia bean = new Membresia();
        Socio bean2 = new Socio();
        
        bean=mem.leerxid("ME000006");
        bean2=soc.consultaxid("S00001");
        
        CreaAcuerdo make = new CreaAcuerdo();
        make.CreaAcuerdo(bean, bean2);
        
    }
    
}
