/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import pe.gym.model.Socio;
import pe.gym.service.espec.SocioServiceEspec;
import pe.gym.service.impl.SocioService;

/**
 *
 * @author Carlos
 */
public class PruebaModificarSocio {
    
    public static void main(String[] args) {
        
        try{
        SocioServiceEspec service = new SocioService();
        Socio bean = new Socio();
        
        bean.setIdSocio("S00004");
        bean.setTelefono(12345678);
        bean.setEmail("cambiodeemail@loquesea.com");
        bean.setEstado("Anulado");
        
        service.modificar(bean);
        
        
            System.out.println("Modificacion Exitosa");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error :c "+e.getMessage());
        }
    }
    
}
