/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Carlos
 */
public class Herramientas {


    public static String ObtenerFecha(Calendar cal) {
     
        
        Date date=cal.getTime();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String fecha=sdf.format(date);
        return fecha;
    }

    public static Calendar IngresarFechaModificada(Calendar cal, int aumento, int aumento2) {
        int mes = cal.get(Calendar.MONTH);
        int anio = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int nummes = mes+aumento;
        int days = day+(aumento2*7);
        

        cal.set(anio, nummes, days);

        return cal;
    }

    public static Calendar IngresarFecha(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(fecha);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        return cal;
    }

    public static Calendar FechaActual() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal;
    }
    
    public static Calendar ObtenerFechaCongelamiento(Calendar fecha1, Calendar fecha2){
        
        
        return null;
    }



    
    
}
