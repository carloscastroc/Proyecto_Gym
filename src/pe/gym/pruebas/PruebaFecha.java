/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Carlos
 */
public class PruebaFecha {

    public static void main(String[] args) {
        
        
        Date ahora = new Date();

        String DATE_FORMAT = "yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        String fec=sdf.format(ahora);
        System.out.println(fec);
        
        
    }
    
    
}
