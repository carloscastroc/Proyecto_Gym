/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.util;

import java.util.Calendar;


/**
 *
 * @author Carlos
 */
public class Herramientas {
    
            public static String ObtenerFecha(Calendar cal) {
        String fecha = "";

        String dia = Integer.toString(cal.get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(cal.get(Calendar.MONTH));
        String anio = Integer.toString(cal.get(Calendar.YEAR));

        fecha = anio + "/" + mes + "/" + dia;

        return fecha;
    }
            
            public static Calendar IngresarFechaModificada (Calendar cal, int aumento){
                cal.set(Calendar.MONTH, +aumento);
                return cal;
            }            
     
     
    
}
