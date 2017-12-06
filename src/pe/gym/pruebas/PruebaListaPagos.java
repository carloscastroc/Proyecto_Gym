/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.util.ArrayList;
import java.util.List;
import pe.gym.model.Pagos;
import pe.gym.service.espec.PagosServiceEspec;
import pe.gym.service.impl.PagosService;

/**
 *
 * @author Carlos
 */
public class PruebaListaPagos {
    
    public static void main(String[] args) {
        PagosServiceEspec service = new PagosService();
        List<Pagos> lista = new ArrayList<>();
        
        String dni="";
        
        lista=service.consultarPagoxDNI(dni);
        
        for (Pagos en : lista) {
            System.out.println(en.getIdPago()+ " - " + 
                    en.getIdMembresia() + " - " + 
                    en.getIdSocio()+ " - " + 
                    en.getNombre()+ " - " + 
                    en.getApellido()+ " - " + 
                    en.getNroCuotas()+ " - " + 
                    en.getDNI()+ " - " 
                    );
            
        }
        
        
    }
    
}
